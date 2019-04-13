package typings
package spexLib.spexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Errors namespace
// API: http://vitaly-t.github.io/spex/errors.html
@JSImport("spex", "errors")
@js.native
object errorsNs extends js.Object {
  // API: http://vitaly-t.github.io/spex/errors.BatchError.html
  @js.native
  class BatchError ()
    extends stdLib.Error {
    // extended properties:
    var data: js.Array[spexLib.spexMod.TBatchData] = js.native
    var first: js.Any = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    @JSName("stack")
    var stack_BatchError: java.lang.String = js.native
    var stat: spexLib.spexMod.IBatchStat = js.native
    // API: http://vitaly-t.github.io/spex/errors.BatchError.html#.getErrors
    def getErrors(): js.Array[_] = js.native
  }
  
  // API: http://vitaly-t.github.io/spex/errors.PageError.html
  @js.native
  class PageError ()
    extends stdLib.Error {
    var dest: js.Any = js.native
    var duration: scala.Double = js.native
    // extended properties:
    var error: js.Any = js.native
    var index: scala.Double = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    var reason: java.lang.String = js.native
    var source: js.Any = js.native
    @JSName("stack")
    var stack_PageError: java.lang.String = js.native
  }
  
  // API: http://vitaly-t.github.io/spex/errors.SequenceError.html
  @js.native
  class SequenceError ()
    extends stdLib.Error {
    var dest: js.Any = js.native
    var duration: scala.Double = js.native
    // extended properties:
    var error: js.Any = js.native
    var index: scala.Double = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    var reason: java.lang.String = js.native
    var source: js.Any = js.native
    @JSName("stack")
    var stack_SequenceError: java.lang.String = js.native
  }
  
}

