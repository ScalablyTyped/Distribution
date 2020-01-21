package typings.spex.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Errors namespace
// API: http://vitaly-t.github.io/spex/errors.html
@JSImport("spex", "errors")
@js.native
object errors extends js.Object {
  // API: http://vitaly-t.github.io/spex/errors.BatchError.html
  @js.native
  class BatchError () extends Error {
    // extended properties:
    var data: js.Array[IBatchData] = js.native
    var first: js.Any = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    @JSName("stack")
    var stack_BatchError: String = js.native
    var stat: IBatchStat = js.native
    // API: http://vitaly-t.github.io/spex/errors.BatchError.html#.getErrors
    def getErrors(): js.Array[_] = js.native
  }
  
  // API: http://vitaly-t.github.io/spex/errors.PageError.html
  @js.native
  class PageError () extends Error {
    var dest: js.Any = js.native
    var duration: Double = js.native
    // extended properties:
    var error: js.Any = js.native
    var index: Double = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    var reason: String = js.native
    var source: js.Any = js.native
    @JSName("stack")
    var stack_PageError: String = js.native
  }
  
  // API: http://vitaly-t.github.io/spex/errors.SequenceError.html
  @js.native
  class SequenceError () extends Error {
    var dest: js.Any = js.native
    var duration: Double = js.native
    // extended properties:
    var error: js.Any = js.native
    var index: Double = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    var reason: String = js.native
    var source: js.Any = js.native
    @JSName("stack")
    var stack_SequenceError: String = js.native
  }
  
}

