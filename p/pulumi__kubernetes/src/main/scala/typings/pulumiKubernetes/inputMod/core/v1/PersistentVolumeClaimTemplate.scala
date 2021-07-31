package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistentVolumeClaimTemplate is used to produce PersistentVolumeClaim objects as part of an EphemeralVolumeSource.
  */
trait PersistentVolumeClaimTemplate extends StObject {
  
  /**
    * May contain labels and annotations that will be copied into the PVC when creating it. No other fields are allowed and will be rejected during validation.
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  
  /**
    * The specification for the PersistentVolumeClaim. The entire content is copied unchanged into the PVC that gets created from this template. The same fields as in a PersistentVolumeClaim are also valid here.
    */
  var spec: Input[PersistentVolumeClaimSpec]
}
object PersistentVolumeClaimTemplate {
  
  @scala.inline
  def apply(spec: Input[PersistentVolumeClaimSpec]): PersistentVolumeClaimTemplate = {
    val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeClaimTemplate]
  }
  
  @scala.inline
  implicit class PersistentVolumeClaimTemplateMutableBuilder[Self <: PersistentVolumeClaimTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setSpec(value: Input[PersistentVolumeClaimSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
  }
}
