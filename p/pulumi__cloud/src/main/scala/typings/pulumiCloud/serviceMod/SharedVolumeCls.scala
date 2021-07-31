package typings.pulumiCloud.serviceMod

import typings.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("@pulumi/cloud/service", "SharedVolume")
@js.native
class SharedVolumeCls protected ()
  extends StObject
     with SharedVolume {
  /**
    * Construct a new Volume with the given unique name.
    *
    * @param name The unique name of the volume.
    * @param opts A bag of options that controls how this resource behaves.
    */
  def this(name: String) = this()
  def this(name: String, opts: ResourceOptions) = this()
  
  /* CompleteClass */
  var kind: typings.pulumiCloud.pulumiCloudStrings.SharedVolume = js.native
  
  /* CompleteClass */
  var name: String = js.native
}
