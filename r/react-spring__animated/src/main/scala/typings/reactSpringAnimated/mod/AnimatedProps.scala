package typings.reactSpringAnimated.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidObserver * / any */ @JSImport("@react-spring/animated", "AnimatedProps")
@js.native
class AnimatedProps protected () extends AnimatedObject {
  def this(update: js.Function0[Unit]) = this()
  
  /** Equals true when an update is scheduled for "end of frame" */
  var dirty: Boolean = js.native
  
  /** @internal */
  def onParentChange(
    hasType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidEvent */ js.Any
  ): Unit = js.native
  
  def setValue(): Unit = js.native
  def setValue(props: Null, context: TreeContext): Unit = js.native
  def setValue(props: Props): Unit = js.native
  def setValue(props: Props, context: TreeContext): Unit = js.native
  
  def update(): Unit = js.native
}
