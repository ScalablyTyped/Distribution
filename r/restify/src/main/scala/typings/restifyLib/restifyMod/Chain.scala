package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chain extends js.Object {
  /** Prevents calling next multiple times */
  var onceNext: scala.Boolean
  /** Throws error when next() is called more than once, enables onceNext option */
  var strictNext: scala.Boolean
  /** Utilize the given middleware `handler` */
  def add(handler: RequestHandler): scala.Unit
  /** Returns the number of handlers */
  def count(): scala.Double
  /** Get handlers of a chain instance */
  def getHandlers(): js.Array[RequestHandler]
  /** Handle server requests, punting them down the middleware stack. */
  def run(req: Request, res: Response, done: js.Function0[_]): scala.Unit
}

