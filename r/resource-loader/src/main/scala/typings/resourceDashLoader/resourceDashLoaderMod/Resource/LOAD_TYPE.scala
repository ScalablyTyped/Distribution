package typings.resourceDashLoader.resourceDashLoaderMod.Resource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LOAD_TYPE extends js.Object

/**
  * The types of loading a resource can use.
  *
  * @static
  * @readonly
  * @enum {number}
  */
@JSImport("resource-loader", "Resource.LOAD_TYPE")
@js.native
object LOAD_TYPE extends js.Object {
  @js.native
  sealed trait AUDIO extends LOAD_TYPE
  
  @js.native
  sealed trait IMAGE extends LOAD_TYPE
  
  @js.native
  sealed trait VIDEO extends LOAD_TYPE
  
  @js.native
  sealed trait XHR extends LOAD_TYPE
  
  /* 2 */ val AUDIO: typings.resourceDashLoader.resourceDashLoaderMod.Resource.LOAD_TYPE.AUDIO with Double = js.native
  /* 1 */ val IMAGE: typings.resourceDashLoader.resourceDashLoaderMod.Resource.LOAD_TYPE.IMAGE with Double = js.native
  /* 3 */ val VIDEO: typings.resourceDashLoader.resourceDashLoaderMod.Resource.LOAD_TYPE.VIDEO with Double = js.native
  /* 0 */ val XHR: typings.resourceDashLoader.resourceDashLoaderMod.Resource.LOAD_TYPE.XHR with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LOAD_TYPE with Double] = js.native
}

