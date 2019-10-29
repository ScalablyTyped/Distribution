package typings.resourceDashLoader.resourceDashLoaderMod.Resource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TYPE extends js.Object

/**
  * The types of resources a resource could represent.
  *
  * @static
  * @readonly
  * @enum {number}
  */
@JSImport("resource-loader", "Resource.TYPE")
@js.native
object TYPE extends js.Object {
  @js.native
  sealed trait AUDIO extends TYPE
  
  @js.native
  sealed trait IMAGE extends TYPE
  
  @js.native
  sealed trait JSON extends TYPE
  
  @js.native
  sealed trait TEXT extends TYPE
  
  @js.native
  sealed trait UNKNOWN extends TYPE
  
  @js.native
  sealed trait VIDEO extends TYPE
  
  @js.native
  sealed trait XML extends TYPE
  
  /* 4 */ val AUDIO: typings.resourceDashLoader.resourceDashLoaderMod.Resource.TYPE.AUDIO with Double = js.native
  /* 3 */ val IMAGE: typings.resourceDashLoader.resourceDashLoaderMod.Resource.TYPE.IMAGE with Double = js.native
  /* 1 */ val JSON: typings.resourceDashLoader.resourceDashLoaderMod.Resource.TYPE.JSON with Double = js.native
  /* 6 */ val TEXT: typings.resourceDashLoader.resourceDashLoaderMod.Resource.TYPE.TEXT with Double = js.native
  /* 0 */ val UNKNOWN: typings.resourceDashLoader.resourceDashLoaderMod.Resource.TYPE.UNKNOWN with Double = js.native
  /* 5 */ val VIDEO: typings.resourceDashLoader.resourceDashLoaderMod.Resource.TYPE.VIDEO with Double = js.native
  /* 2 */ val XML: typings.resourceDashLoader.resourceDashLoaderMod.Resource.TYPE.XML with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TYPE with Double] = js.native
}

