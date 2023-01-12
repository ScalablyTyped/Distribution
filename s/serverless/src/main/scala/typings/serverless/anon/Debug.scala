package typings.serverless.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Debug extends StObject {
  
  def debug(args: Any*): Unit
  
  def error(args: Any*): Unit
  
  def info(args: Any*): Unit
  
  def notice(args: Any*): Unit
  
  def success(args: Any*): Unit
  
  def verbose(args: Any*): Unit
  
  def warning(args: Any*): Unit
}
object Debug {
  
  inline def apply(
    debug: /* repeated */ Any => Unit,
    error: /* repeated */ Any => Unit,
    info: /* repeated */ Any => Unit,
    notice: /* repeated */ Any => Unit,
    success: /* repeated */ Any => Unit,
    verbose: /* repeated */ Any => Unit,
    warning: /* repeated */ Any => Unit
  ): Debug = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), notice = js.Any.fromFunction1(notice), success = js.Any.fromFunction1(success), verbose = js.Any.fromFunction1(verbose), warning = js.Any.fromFunction1(warning))
    __obj.asInstanceOf[Debug]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
    
    inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    inline def setNotice(value: /* repeated */ Any => Unit): Self = StObject.set(x, "notice", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: /* repeated */ Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setVerbose(value: /* repeated */ Any => Unit): Self = StObject.set(x, "verbose", js.Any.fromFunction1(value))
    
    inline def setWarning(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warning", js.Any.fromFunction1(value))
  }
}
