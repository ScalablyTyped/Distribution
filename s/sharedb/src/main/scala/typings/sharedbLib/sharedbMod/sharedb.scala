package typings
package sharedbLib.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait sharedb extends js.Object {
  /**
    * Registers a projection that can be used from clients just like a normal collection.
    *
    * @param name name of the projection
    * @param collection name of the backing collection
    * @param fields field whitelist for the projection
    */
  def addProjection(name: java.lang.String, collection: java.lang.String, fields: ProjectionFields): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function1[/* err */ js.UndefOr[sharedbLib.sharedbMod.sharedbNs.Error], _]): scala.Unit = js.native
  def connect(): sharedbLib.sharedbMod.sharedbNs.Connection = js.native
  def connect(connection: js.Any): sharedbLib.sharedbMod.sharedbNs.Connection = js.native
  def connect(connection: js.Any, req: js.Any): sharedbLib.sharedbMod.sharedbNs.Connection = js.native
  def listen(stream: js.Any): scala.Unit = js.native
  /**
    * Registers a server middleware function.
    *
    * @param action name of an action from https://github.com/share/sharedb#middlewares
    * @param fn listener invoked when the specified action occurs
    */
  @JSName("use")
  def use_afterSubmit(
    action: sharedbLib.sharedbLibStrings.afterSubmit,
    fn: js.Function2[
      /* context */ sharedbLib.sharedbMod.middlewareNs.SubmitContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Registers a server middleware function.
    *
    * @param action name of an action from https://github.com/share/sharedb#middlewares
    * @param fn listener invoked when the specified action occurs
    */
  @JSName("use")
  def use_apply(
    action: sharedbLib.sharedbLibStrings.apply,
    fn: js.Function2[
      /* context */ sharedbLib.sharedbMod.middlewareNs.ApplyContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Registers a server middleware function.
    *
    * @param action name of an action from https://github.com/share/sharedb#middlewares
    * @param fn listener invoked when the specified action occurs
    */
  @JSName("use")
  def use_commit(
    action: sharedbLib.sharedbLibStrings.commit,
    fn: js.Function2[
      /* context */ sharedbLib.sharedbMod.middlewareNs.CommitContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Registers a server middleware function.
    *
    * @param action name of an action from https://github.com/share/sharedb#middlewares
    * @param fn listener invoked when the specified action occurs
    */
  @JSName("use")
  def use_connect(
    action: sharedbLib.sharedbLibStrings.connect,
    fn: js.Function2[
      /* context */ sharedbLib.sharedbMod.middlewareNs.ConnectContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Registers a server middleware function.
    *
    * @param action name of an action from https://github.com/share/sharedb#middlewares
    * @param fn listener invoked when the specified action occurs
    */
  @JSName("use")
  def use_doc(
    action: sharedbLib.sharedbLibStrings.doc,
    fn: js.Function2[
      /* context */ sharedbLib.sharedbMod.middlewareNs.DocContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Registers a server middleware function.
    *
    * @param action name of an action from https://github.com/share/sharedb#middlewares
    * @param fn listener invoked when the specified action occurs
    */
  @JSName("use")
  def use_op(
    action: sharedbLib.sharedbLibStrings.op,
    fn: js.Function2[
      /* context */ sharedbLib.sharedbMod.middlewareNs.OpContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Registers a server middleware function.
    *
    * @param action name of an action from https://github.com/share/sharedb#middlewares
    * @param fn listener invoked when the specified action occurs
    */
  @JSName("use")
  def use_query(
    action: sharedbLib.sharedbLibStrings.query,
    fn: js.Function2[
      /* context */ sharedbLib.sharedbMod.middlewareNs.QueryContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Registers a server middleware function.
    *
    * @param action name of an action from https://github.com/share/sharedb#middlewares
    * @param fn listener invoked when the specified action occurs
    */
  @JSName("use")
  def use_readSnapshots(
    action: sharedbLib.sharedbLibStrings.readSnapshots,
    fn: js.Function2[
      /* context */ sharedbLib.sharedbMod.middlewareNs.ReadSnapshotsContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Registers a server middleware function.
    *
    * @param action name of an action from https://github.com/share/sharedb#middlewares
    * @param fn listener invoked when the specified action occurs
    */
  @JSName("use")
  def use_receive(
    action: sharedbLib.sharedbLibStrings.receive,
    fn: js.Function2[
      /* context */ sharedbLib.sharedbMod.middlewareNs.ReceiveContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Registers a server middleware function.
    *
    * @param action name of an action from https://github.com/share/sharedb#middlewares
    * @param fn listener invoked when the specified action occurs
    */
  @JSName("use")
  def use_reply(
    action: sharedbLib.sharedbLibStrings.reply,
    fn: js.Function2[
      /* context */ sharedbLib.sharedbMod.middlewareNs.ReplyContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Registers a server middleware function.
    *
    * @param action name of an action from https://github.com/share/sharedb#middlewares
    * @param fn listener invoked when the specified action occurs
    */
  @JSName("use")
  def use_submit(
    action: sharedbLib.sharedbLibStrings.submit,
    fn: js.Function2[
      /* context */ sharedbLib.sharedbMod.middlewareNs.SubmitContext, 
      /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

