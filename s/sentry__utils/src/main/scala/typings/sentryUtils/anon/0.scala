package typings.sentryUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def parse(urlStr: String): Query
}
object `0` {
  
  inline def apply(parse: String => Query): `0` = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setParse(value: String => Query): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
  }
}
