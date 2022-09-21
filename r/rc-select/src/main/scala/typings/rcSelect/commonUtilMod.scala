package typings.rcSelect

import typings.rcSelect.baseSelectMod.DisplayValueType
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonUtilMod {
  
  @JSImport("rc-select/lib/utils/commonUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTitle(item: DisplayValueType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTitle")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hasValue(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("rc-select/lib/utils/commonUtil", "isBrowserClient")
  @js.native
  val isBrowserClient: HTMLElement = js.native
  
  @JSImport("rc-select/lib/utils/commonUtil", "isClient")
  @js.native
  val isClient: HTMLElement = js.native
  
  inline def toArray[T](value: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def toArray[T](value: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
