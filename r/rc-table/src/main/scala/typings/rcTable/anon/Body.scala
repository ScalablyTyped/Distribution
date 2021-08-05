package typings.rcTable.anon

import typings.react.mod.MutableRefObject
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  var body: MutableRefObject[HTMLDivElement]
}
object Body {
  
  inline def apply(body: MutableRefObject[HTMLDivElement]): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  extension [Self <: Body](x: Self) {
    
    inline def setBody(value: MutableRefObject[HTMLDivElement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
