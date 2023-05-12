package typings.smallweiAvue.anon

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Excel extends StObject {
  
  def excel(arg: Columns): Unit
  
  def xlsx(raw: File): js.Promise[Results]
}
object Excel {
  
  inline def apply(excel: Columns => Unit, xlsx: File => js.Promise[Results]): Excel = {
    val __obj = js.Dynamic.literal(excel = js.Any.fromFunction1(excel), xlsx = js.Any.fromFunction1(xlsx))
    __obj.asInstanceOf[Excel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Excel] (val x: Self) extends AnyVal {
    
    inline def setExcel(value: Columns => Unit): Self = StObject.set(x, "excel", js.Any.fromFunction1(value))
    
    inline def setXlsx(value: File => js.Promise[Results]): Self = StObject.set(x, "xlsx", js.Any.fromFunction1(value))
  }
}
