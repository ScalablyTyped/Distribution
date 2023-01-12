package typings.sentryUtils.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parse extends StObject {
  
  def parse(cookieStr: String): Record[String, String]
}
object Parse {
  
  inline def apply(parse: String => Record[String, String]): Parse = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[Parse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parse] (val x: Self) extends AnyVal {
    
    inline def setParse(value: String => Record[String, String]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
  }
}
