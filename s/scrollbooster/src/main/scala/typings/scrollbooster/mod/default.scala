package typings.scrollbooster.mod

import typings.scrollbooster.anon.PartialScrollBoosterOptio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scrollbooster", JSImport.Default)
@js.native
class default protected () extends ScrollBooster {
  def this(options: ScrollBoosterOptions) = this()
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def getState(): ScrollingState = js.native
  /* CompleteClass */
  override def scrollTo(position: Position): Unit = js.native
  /* CompleteClass */
  override def setPosition(position: Position): Unit = js.native
  /* CompleteClass */
  override def updateMetrics(): Unit = js.native
  /* CompleteClass */
  override def updateOptions(options: PartialScrollBoosterOptio): Unit = js.native
}

