package typings.reactMentions

import typings.reactMentions.reactMentionsBooleans.`false`
import typings.reactMentions.reactMentionsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isPlainObjectMod {
  
  @JSImport("react-mentions/lib/utils/isPlainObject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPlainObject[T](obj: T): `false` | `true` = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(obj.asInstanceOf[js.Any]).asInstanceOf[`false` | `true`]
}
