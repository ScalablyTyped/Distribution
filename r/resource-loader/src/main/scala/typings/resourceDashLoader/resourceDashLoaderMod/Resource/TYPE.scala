package typings.resourceDashLoader.resourceDashLoaderMod.Resource

import org.scalablytyped.runtime.TopLevel
import typings.resourceDashLoader.resourceDashLoaderMod.Resource.TYPE.AUDIO
import typings.resourceDashLoader.resourceDashLoaderMod.Resource.TYPE.IMAGE
import typings.resourceDashLoader.resourceDashLoaderMod.Resource.TYPE.JSON
import typings.resourceDashLoader.resourceDashLoaderMod.Resource.TYPE.TEXT
import typings.resourceDashLoader.resourceDashLoaderMod.Resource.TYPE.UNKNOWN
import typings.resourceDashLoader.resourceDashLoaderMod.Resource.TYPE.VIDEO
import typings.resourceDashLoader.resourceDashLoaderMod.Resource.TYPE.XML
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TYPE with Double] = js.native
  /* 4 */ @js.native
  object AUDIO extends TopLevel[AUDIO with Double]
  
  /* 3 */ @js.native
  object IMAGE extends TopLevel[IMAGE with Double]
  
  /* 1 */ @js.native
  object JSON extends TopLevel[JSON with Double]
  
  /* 6 */ @js.native
  object TEXT extends TopLevel[TEXT with Double]
  
  /* 0 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
  
  /* 5 */ @js.native
  object VIDEO extends TopLevel[VIDEO with Double]
  
  /* 2 */ @js.native
  object XML extends TopLevel[XML with Double]
  
}

