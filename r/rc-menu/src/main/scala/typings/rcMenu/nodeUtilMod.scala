package typings.rcMenu

import typings.rcMenu.interfaceMod.ItemType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeUtilMod {
  
  @JSImport("rc-menu/es/utils/nodeUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseChildren(children: Unit, keyPath: js.Array[String]): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseChildren")(children.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  inline def parseChildren(children: ReactNode, keyPath: js.Array[String]): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseChildren")(children.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  
  inline def parseItems(children: Unit, items: js.Array[ItemType], keyPath: js.Array[String]): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseItems")(children.asInstanceOf[js.Any], items.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  inline def parseItems(children: Unit, items: Unit, keyPath: js.Array[String]): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseItems")(children.asInstanceOf[js.Any], items.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  inline def parseItems(children: ReactNode, items: js.Array[ItemType], keyPath: js.Array[String]): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseItems")(children.asInstanceOf[js.Any], items.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  inline def parseItems(children: ReactNode, items: Unit, keyPath: js.Array[String]): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseItems")(children.asInstanceOf[js.Any], items.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
}
