package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachOpts extends StObject {
  
  /** If the target anchor is already occupied, this instance will be moved to the end of the queue to occupy it, meaning that all of the other attached instances will need to be detached before this one can occupy the anchor. */
  var append: js.UndefOr[Boolean] = js.undefined
  
  /** The index of the position in the queue for the target anchor at which to insert this instance. 0 is equivalent to prepend: true. */
  var insertAt: js.UndefOr[Double] = js.undefined
  
  /** If the target anchor is already occupied, this instance will be moved to the beginning of the queue to occupy it, meaning it will replace the instance currently occupying the anchor. */
  var prepend: js.UndefOr[Boolean] = js.undefined
  
  /** The name of an anchor to attach a child to e.g. 'foo' for <#foo />. */
  var target: js.UndefOr[String] = js.undefined
}
object AttachOpts {
  
  @scala.inline
  def apply(): AttachOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachOpts]
  }
  
  @scala.inline
  implicit class AttachOptsMutableBuilder[Self <: AttachOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
    
    @scala.inline
    def setInsertAt(value: Double): Self = StObject.set(x, "insertAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertAtUndefined: Self = StObject.set(x, "insertAt", js.undefined)
    
    @scala.inline
    def setPrepend(value: Boolean): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
