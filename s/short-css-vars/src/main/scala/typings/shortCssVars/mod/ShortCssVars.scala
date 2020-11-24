package typings.shortCssVars.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShortCssVars extends js.Object {
  
  /**
    * Get a mapping of original names to shortened names
    *
    * @example
    * {
    *   'long-variable-name-that-defines-a-particular-color': '1vf2dsn'
    * }
    * @returns map
    */
  def getMap(): StringDictionary[String] = js.native
  
  /**
    * Shortens the names of variables throughout CSS
    * @param css - Text containing CSS variables
    * @returns shortened CSS
    */
  def replaceCss(css: String): String = js.native
  
  /**
    * Shortens the name part of a variable string
    * @param varName - Variable name including -- prefix
    * @returns short
    */
  def replaceName(varName: String): String = js.native
}
object ShortCssVars {
  
  @scala.inline
  def apply(
    getMap: () => StringDictionary[String],
    replaceCss: String => String,
    replaceName: String => String
  ): ShortCssVars = {
    val __obj = js.Dynamic.literal(getMap = js.Any.fromFunction0(getMap), replaceCss = js.Any.fromFunction1(replaceCss), replaceName = js.Any.fromFunction1(replaceName))
    __obj.asInstanceOf[ShortCssVars]
  }
  
  @scala.inline
  implicit class ShortCssVarsOps[Self <: ShortCssVars] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetMap(value: () => StringDictionary[String]): Self = this.set("getMap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReplaceCss(value: String => String): Self = this.set("replaceCss", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceName(value: String => String): Self = this.set("replaceName", js.Any.fromFunction1(value))
  }
}
