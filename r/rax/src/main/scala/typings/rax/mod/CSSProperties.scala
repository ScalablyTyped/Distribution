package typings.rax.mod

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSProperties
  extends StObject
     with Properties[String | Double]
     with /**
  * The index signature was removed to enable closed typing for style
  * using CSSType. You're able to use type assertion or module augmentation
  * to add properties or an index signature of your own.
  *
  * For examples and more information, visit:
  * https://github.com/frenic/csstype#what-should-i-do-when-i-get-type-errors
  */
/* key */ StringDictionary[js.Any]
object CSSProperties {
  
  inline def apply(): CSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSProperties]
  }
}
