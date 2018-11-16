package typings
package prexLib.outLibCancellationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/cancellation", "CancellationTokenSource")
@js.native
class CancellationTokenSource () extends js.Object {
  /**
       * Initializes a new instance of a CancellationTokenSource.
       *
       * @param linkedTokens An optional iterable of tokens to which to link this source.
       */
  def this(linkedTokens: stdLib.Iterable[CancellationToken]) = this()
  var _linkingRegistrations: js.Any = js.native
  var _registrations: js.Any = js.native
  var _state: js.Any = js.native
  var _token: js.Any = js.native
  /**
       * Gets a CancellationToken linked to this source.
       */
  val token: CancellationToken = js.native
  /**
       * Executes the provided callback.
       *
       * @param callback The callback to execute.
       */
  /* private */ def _executeCallback(callback: js.Any): js.Any = js.native
  /**
       * Unlinks the source from any linked tokens.
       */
  /* private */ def _unlink(): js.Any = js.native
  /**
       * Cancels the source, evaluating any registered callbacks. If any callback raises an exception,
       * the exception is propagated to a host specific unhanedle exception mechanism.
       */
  def cancel(): scala.Unit = js.native
  /**
       * Closes the source, preventing the possibility of future cancellation.
       */
  def close(): scala.Unit = js.native
}

