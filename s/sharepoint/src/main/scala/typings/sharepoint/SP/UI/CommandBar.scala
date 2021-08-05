package typings.sharepoint.SP.UI

import typings.sharepoint.SP.HtmlBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandBar extends StObject {
  
  def addCommand(action: Command): Unit
  
  def attachEvents(): Unit
  
  def findCommandByName(name: String): Command
  
  def get_commands(): js.Array[Command]
  
  def get_dropDownThreshold(): Double
  
  def get_elementID(): String
  
  def get_overrideClass(): String
  
  def insertCommand(action: Command, position: Double): Unit
  
  def render(builder: HtmlBuilder): Unit
  
  def set_dropDownThreshold(value: Double): Double
  
  def set_overrideClass(value: String): String
}
object CommandBar {
  
  inline def apply(
    addCommand: Command => Unit,
    attachEvents: () => Unit,
    findCommandByName: String => Command,
    get_commands: () => js.Array[Command],
    get_dropDownThreshold: () => Double,
    get_elementID: () => String,
    get_overrideClass: () => String,
    insertCommand: (Command, Double) => Unit,
    render: HtmlBuilder => Unit,
    set_dropDownThreshold: Double => Double,
    set_overrideClass: String => String
  ): CommandBar = {
    val __obj = js.Dynamic.literal(addCommand = js.Any.fromFunction1(addCommand), attachEvents = js.Any.fromFunction0(attachEvents), findCommandByName = js.Any.fromFunction1(findCommandByName), get_commands = js.Any.fromFunction0(get_commands), get_dropDownThreshold = js.Any.fromFunction0(get_dropDownThreshold), get_elementID = js.Any.fromFunction0(get_elementID), get_overrideClass = js.Any.fromFunction0(get_overrideClass), insertCommand = js.Any.fromFunction2(insertCommand), render = js.Any.fromFunction1(render), set_dropDownThreshold = js.Any.fromFunction1(set_dropDownThreshold), set_overrideClass = js.Any.fromFunction1(set_overrideClass))
    __obj.asInstanceOf[CommandBar]
  }
  
  extension [Self <: CommandBar](x: Self) {
    
    inline def setAddCommand(value: Command => Unit): Self = StObject.set(x, "addCommand", js.Any.fromFunction1(value))
    
    inline def setAttachEvents(value: () => Unit): Self = StObject.set(x, "attachEvents", js.Any.fromFunction0(value))
    
    inline def setFindCommandByName(value: String => Command): Self = StObject.set(x, "findCommandByName", js.Any.fromFunction1(value))
    
    inline def setGet_commands(value: () => js.Array[Command]): Self = StObject.set(x, "get_commands", js.Any.fromFunction0(value))
    
    inline def setGet_dropDownThreshold(value: () => Double): Self = StObject.set(x, "get_dropDownThreshold", js.Any.fromFunction0(value))
    
    inline def setGet_elementID(value: () => String): Self = StObject.set(x, "get_elementID", js.Any.fromFunction0(value))
    
    inline def setGet_overrideClass(value: () => String): Self = StObject.set(x, "get_overrideClass", js.Any.fromFunction0(value))
    
    inline def setInsertCommand(value: (Command, Double) => Unit): Self = StObject.set(x, "insertCommand", js.Any.fromFunction2(value))
    
    inline def setRender(value: HtmlBuilder => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    inline def setSet_dropDownThreshold(value: Double => Double): Self = StObject.set(x, "set_dropDownThreshold", js.Any.fromFunction1(value))
    
    inline def setSet_overrideClass(value: String => String): Self = StObject.set(x, "set_overrideClass", js.Any.fromFunction1(value))
  }
}
