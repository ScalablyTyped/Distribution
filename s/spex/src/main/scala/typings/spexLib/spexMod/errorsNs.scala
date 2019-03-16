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
    extends spexLib.spexMod.spexNs.errorsNs.BatchError {
    // extended properties:
    /* CompleteClass */
    override var data: js.Array[spexLib.spexMod.spexNs.TBatchData] = js.native
    /* CompleteClass */
    override var first: js.Any = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    @JSName("stack")
    override var stack_BatchError: java.lang.String = js.native
    /* CompleteClass */
    override var stat: spexLib.spexMod.spexNs.IBatchStat = js.native
    // API: http://vitaly-t.github.io/spex/errors.BatchError.html#.getErrors
    /* CompleteClass */
    override def getErrors(): js.Array[_] = js.native
  }
  
  // API: http://vitaly-t.github.io/spex/errors.PageError.html
  @js.native
  class PageError ()
    extends spexLib.spexMod.spexNs.errorsNs.PageError {
    /* CompleteClass */
    override var dest: js.Any = js.native
    /* CompleteClass */
    override var duration: scala.Double = js.native
    // extended properties:
    /* CompleteClass */
    override var error: js.Any = js.native
    /* CompleteClass */
    override var index: scala.Double = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    override var reason: java.lang.String = js.native
    /* CompleteClass */
    override var source: js.Any = js.native
    /* CompleteClass */
    @JSName("stack")
    override var stack_PageError: java.lang.String = js.native
  }
  
  // API: http://vitaly-t.github.io/spex/errors.SequenceError.html
  @js.native
  class SequenceError ()
    extends spexLib.spexMod.spexNs.errorsNs.SequenceError {
    /* CompleteClass */
    override var dest: js.Any = js.native
    /* CompleteClass */
    override var duration: scala.Double = js.native
    // extended properties:
    /* CompleteClass */
    override var error: js.Any = js.native
    /* CompleteClass */
    override var index: scala.Double = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    override var reason: java.lang.String = js.native
    /* CompleteClass */
    override var source: js.Any = js.native
    /* CompleteClass */
    @JSName("stack")
    override var stack_SequenceError: java.lang.String = js.native
  }
  
}

