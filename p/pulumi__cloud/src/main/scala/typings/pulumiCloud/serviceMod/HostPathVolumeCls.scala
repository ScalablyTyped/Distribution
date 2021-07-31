package typings.pulumiCloud.serviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("@pulumi/cloud/service", "HostPathVolume")
@js.native
class HostPathVolumeCls protected ()
  extends StObject
     with HostPathVolume {
  /**
    * Construct a new Volume with the given unique name.
    */
  def this(path: String) = this()
  
  /* CompleteClass */
  var kind: typings.pulumiCloud.pulumiCloudStrings.HostPathVolume = js.native
  
  /* CompleteClass */
  var path: String = js.native
}
