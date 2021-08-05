package typings.reactMdTable

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.react.mod.TableHTMLAttributes
import typings.reactMdTable.configMod.TableConfiguration
import typings.std.HTMLTableElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  @JSImport("@react-md/table/types/Table", "Table")
  @js.native
  val Table: ForwardRefExoticComponent[TableProps & RefAttributes[HTMLTableElement]] = js.native
  
  trait TableProps
    extends StObject
       with TableHTMLAttributes[HTMLTableElement]
       with TableConfiguration
  object TableProps {
    
    inline def apply(): TableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableProps]
    }
  }
}
