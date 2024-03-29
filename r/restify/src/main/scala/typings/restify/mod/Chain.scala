package typings.restify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chain extends StObject {
  
  /** Utilize the given middleware `handler` */
  def add(handler: RequestHandler): Unit
  
  /** Returns the number of handlers */
  def count(): Double
  
  /** Get handlers of a chain instance */
  def getHandlers(): js.Array[RequestHandler]
  
  /** Prevents calling next multiple times */
  var onceNext: Boolean
  
  /** Handle server requests, punting them down the middleware stack. */
  def run(req: Request, res: Response, done: js.Function0[Any]): Unit
  
  /** Throws error when next() is called more than once, enables onceNext option */
  var strictNext: Boolean
}
object Chain {
  
  inline def apply(
    add: RequestHandler => Unit,
    count: () => Double,
    getHandlers: () => js.Array[RequestHandler],
    onceNext: Boolean,
    run: (Request, Response, js.Function0[Any]) => Unit,
    strictNext: Boolean
  ): Chain = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), count = js.Any.fromFunction0(count), getHandlers = js.Any.fromFunction0(getHandlers), onceNext = onceNext.asInstanceOf[js.Any], run = js.Any.fromFunction3(run), strictNext = strictNext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Chain] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: RequestHandler => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
    
    inline def setGetHandlers(value: () => js.Array[RequestHandler]): Self = StObject.set(x, "getHandlers", js.Any.fromFunction0(value))
    
    inline def setOnceNext(value: Boolean): Self = StObject.set(x, "onceNext", value.asInstanceOf[js.Any])
    
    inline def setRun(value: (Request, Response, js.Function0[Any]) => Unit): Self = StObject.set(x, "run", js.Any.fromFunction3(value))
    
    inline def setStrictNext(value: Boolean): Self = StObject.set(x, "strictNext", value.asInstanceOf[js.Any])
  }
}
