package typings.reactMdUtils

import typings.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRefCacheMod {
  
  @JSImport("@react-md/utils/types/useRefCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useRefCache[T](cacheable: T): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefCache")(cacheable.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T]]
}
