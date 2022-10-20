package typings.seleniumWebdriver

import typings.seleniumWebdriver.mod.WebElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSelectMod {
  
  @JSImport("selenium-webdriver/lib/select", "Select")
  @js.native
  open class Select protected () extends StObject {
    /**
      * Create an Select Element
      * @param {WebElement} element Select WebElement.
      */
    def this(element: WebElement) = this()
    
    /**
      * Deselects all selected options
      * @returns {Promise<void>}
      */
    def deselectAll(): js.Promise[Unit] = js.native
    
    /**
      *
      * @param {Number} index       index of option element to deselect
      * Deselect the option at the given index.
      * This is done by examining the "index"
      * attribute of an element, and not merely by counting.
      * @returns {Promise<void>}
      */
    def deselectByIndex(index: Double): js.Promise[Unit] = js.native
    
    /**
      *
      * @param {String} value value of an option to deselect
      * @returns {Promise<void>}
      */
    def deselectByValue(value: String): js.Promise[Unit] = js.native
    
    /**
      *
      * @param {string|Number}text text of option to deselect
      * @returns {Promise<void>}
      */
    def deselectByVisibleText(text: String): js.Promise[Unit] = js.native
    def deselectByVisibleText(text: Double): js.Promise[Unit] = js.native
    
    var element: WebElement = js.native
    
    /**
      * Returns a list of all selected options belonging to this select tag
      *
      * @returns {Promise<void>}
      */
    def getAllSelectedOptions(): js.Promise[js.Array[WebElement]] = js.native
    
    /**
      * Returns first Selected Option
      * @returns {Promise<Element>}
      */
    def getFirstSelectedOption(): js.Promise[js.UndefOr[WebElement]] = js.native
    
    /**
      * @return {!Promise<!Array<!WebElement>>} All options belonging to this select tag
      */
    def getOptions(): js.Promise[js.Array[WebElement]] = js.native
    
    /**
      * Retruns a boolean value if the select tag is multiple
      * @returns {Promise<boolean>}
      */
    def isMultiple(): js.Promise[Boolean] = js.native
    
    /**
      * Select the option at the given index. This is done by examining the "index" attribute of an
      * element, and not merely by counting.
      *
      * @param {Number} index The option at this index will be selected
      * @return {Promise<void>}
      */
    def selectByIndex(index: Double): js.Promise[Unit] = js.native
    
    /**
      *
      * Select option by specific value.
      *
      * <example>
      <select id="selectbox">
      <option value="1">Option 1</option>
      <option value="2">Option 2</option>
      <option value="3">Option 3</option>
      </select>
      const selectBox = await driver.findElement(By.id("selectbox"));
      await selectObject.selectByValue("Value");
      * </example>
      *
      *
      * @param {string} value value of option element to be selected
      */
    def selectByValue(value: String): js.Promise[Unit] = js.native
    
    /**
      *
      * Select option with displayed text matching the argument.
      *
      * <example>
      <select id="selectbox">
      <option value="1">Option 1</option>
      <option value="2">Option 2</option>
      <option value="3">Option 3</option>
      </select>
      const selectBox = await driver.findElement(By.id("selectbox"));
      await selectObject.selectByVisibleText("Option 2");
      * </example>
      *
      * @param {String|Number} text       text of option element to get selected
      *
      */
    def selectByVisibleText(text: String): js.Promise[Unit] = js.native
    def selectByVisibleText(text: Double): js.Promise[Unit] = js.native
  }
}
