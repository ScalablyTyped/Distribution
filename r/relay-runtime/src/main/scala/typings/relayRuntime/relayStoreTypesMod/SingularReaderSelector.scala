package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingularReaderSelector extends ReaderSelector {
  val dataID: DataID = js.native
  val isWithinUnmatchedTypeRefinement: Boolean = js.native
  val kind: String = js.native
  val node: ReaderFragment = js.native
  val owner: RequestDescriptor = js.native
  val variables: Variables = js.native
}

object SingularReaderSelector {
  @scala.inline
  def apply(
    dataID: DataID,
    isWithinUnmatchedTypeRefinement: Boolean,
    kind: String,
    node: ReaderFragment,
    owner: RequestDescriptor,
    variables: Variables
  ): SingularReaderSelector = {
    val __obj = js.Dynamic.literal(dataID = dataID.asInstanceOf[js.Any], isWithinUnmatchedTypeRefinement = isWithinUnmatchedTypeRefinement.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingularReaderSelector]
  }
  @scala.inline
  implicit class SingularReaderSelectorOps[Self <: SingularReaderSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataID(value: DataID): Self = this.set("dataID", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsWithinUnmatchedTypeRefinement(value: Boolean): Self = this.set("isWithinUnmatchedTypeRefinement", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: ReaderFragment): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: RequestDescriptor): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: Variables): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

