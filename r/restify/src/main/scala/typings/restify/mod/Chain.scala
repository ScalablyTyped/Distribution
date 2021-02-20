package typings.restify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chain extends StObject {
  
  /** Utilize the given middleware `handler` */
  def add(handler: RequestHandler): Unit = js.native
  
  /** Returns the number of handlers */
  def count(): Double = js.native
  
  /** Get handlers of a chain instance */
  def getHandlers(): js.Array[RequestHandler] = js.native
  
  /** Prevents calling next multiple times */
  var onceNext: Boolean = js.native
  
  /** Handle server requests, punting them down the middleware stack. */
  def run(req: Request, res: Response, done: js.Function0[_]): Unit = js.native
  
  /** Throws error when next() is called more than once, enables onceNext option */
  var strictNext: Boolean = js.native
}
object Chain {
  
  @scala.inline
  def apply(
    add: RequestHandler => Unit,
    count: () => Double,
    getHandlers: () => js.Array[RequestHandler],
    onceNext: Boolean,
    run: (Request, Response, js.Function0[_]) => Unit,
    strictNext: Boolean
  ): Chain = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), count = js.Any.fromFunction0(count), getHandlers = js.Any.fromFunction0(getHandlers), onceNext = onceNext.asInstanceOf[js.Any], run = js.Any.fromFunction3(run), strictNext = strictNext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chain]
  }
  
  @scala.inline
  implicit class ChainMutableBuilder[Self <: Chain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: RequestHandler => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHandlers(value: () => js.Array[RequestHandler]): Self = StObject.set(x, "getHandlers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnceNext(value: Boolean): Self = StObject.set(x, "onceNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun(value: (Request, Response, js.Function0[_]) => Unit): Self = StObject.set(x, "run", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStrictNext(value: Boolean): Self = StObject.set(x, "strictNext", value.asInstanceOf[js.Any])
  }
}
