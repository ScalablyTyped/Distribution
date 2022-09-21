package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilCoreStrings._empty
import typings.stencilCore.stencilCoreStrings.c
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderNode
  extends StObject
     with HostElement {
  
  /**
    * Is Content Reference Node:
    * This node is a content reference node.
    */
  var `s-cn`: js.UndefOr[Boolean] = js.native
  
  /**
    * Used to know the components encapsulation.
    * empty "" for shadow, "c" from scoped
    */
  var `s-en`: js.UndefOr[_empty | c] = js.native
  
  /**
    * Host element tag name:
    * The tag name of the host element that this
    * node was created in.
    */
  var `s-hn`: js.UndefOr[String] = js.native
  
  /**
    * Host Id (hydrate only)
    */
  var `s-host-id`: js.UndefOr[Double] = js.native
  
  /**
    * Node Id (hydrate only)
    */
  var `s-node-id`: js.UndefOr[Double] = js.native
  
  /**
    * Node reference:
    * This is a reference for a original location node
    * back to the node that's been moved around.
    */
  var `s-nr`: js.UndefOr[RenderNode] = js.native
  
  /**
    * Original Location Reference:
    * A reference pointing to the comment
    * which represents the original location
    * before it was moved to its slot.
    */
  var `s-ol`: js.UndefOr[RenderNode] = js.native
  
  /**
    * Scope Id
    */
  var `s-si`: js.UndefOr[String] = js.native
  
  /**
    * Slot name
    */
  var `s-sn`: js.UndefOr[String] = js.native
  
  /**
    * Is a slot reference node:
    * This is a node that represents where a slot
    * was originally located.
    */
  var `s-sr`: js.UndefOr[Boolean] = js.native
}
