package typings.serverless.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Log extends StObject {
  
  def log(message: String): Null
}
object Log {
  
  @scala.inline
  def apply(log: String => Null): Log = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
    __obj.asInstanceOf[Log]
  }
  
  @scala.inline
  implicit class LogMutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLog(value: String => Null): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
  }
}
