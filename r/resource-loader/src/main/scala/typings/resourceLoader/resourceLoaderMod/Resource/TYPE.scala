package typings.resourceLoader.resourceLoaderMod.Resource

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TYPE with Double] = js.native
  
  @js.native
  sealed trait AUDIO extends TYPE
  /* 4 */ @js.native
  object AUDIO extends TopLevel[AUDIO with Double]
  
  @js.native
  sealed trait IMAGE extends TYPE
  /* 3 */ @js.native
  object IMAGE extends TopLevel[IMAGE with Double]
  
  @js.native
  sealed trait JSON extends TYPE
  /* 1 */ @js.native
  object JSON extends TopLevel[JSON with Double]
  
  @js.native
  sealed trait TEXT extends TYPE
  /* 6 */ @js.native
  object TEXT extends TopLevel[TEXT with Double]
  
  @js.native
  sealed trait UNKNOWN extends TYPE
  /* 0 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
  
  @js.native
  sealed trait VIDEO extends TYPE
  /* 5 */ @js.native
  object VIDEO extends TopLevel[VIDEO with Double]
  
  @js.native
  sealed trait XML extends TYPE
  /* 2 */ @js.native
  object XML extends TopLevel[XML with Double]
}
