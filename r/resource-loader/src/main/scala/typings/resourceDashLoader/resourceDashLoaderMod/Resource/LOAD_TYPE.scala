package typings.resourceDashLoader.resourceDashLoaderMod.Resource

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LOAD_TYPE with Double] = js.native
  /* 2 */ @js.native
  object AUDIO extends TopLevel[AUDIO with Double]
  
  /* 1 */ @js.native
  object IMAGE extends TopLevel[IMAGE with Double]
  
  /* 3 */ @js.native
  object VIDEO extends TopLevel[VIDEO with Double]
  
  /* 0 */ @js.native
  object XHR extends TopLevel[XHR with Double]
  
}

