package typings.pulumiKubernetes.outputMod.storage

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.outputMod.core.v1.PersistentVolumeSpec
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1alpha1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1alpha1 {
  
  /**
    * VolumeAttachment captures the intent to attach or detach the specified volume to/from the specified node.
    *
    * VolumeAttachment objects are non-namespaced.
    */
  @js.native
  trait VolumeAttachment extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: storageDotk8sDotioSlashv1alpha1 = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.VolumeAttachment = js.native
    
    /**
      * Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: ObjectMeta = js.native
    
    /**
      * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.
      */
    var spec: VolumeAttachmentSpec = js.native
    
    /**
      * Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the external-attacher.
      */
    var status: VolumeAttachmentStatus = js.native
  }
  object VolumeAttachment {
    
    @scala.inline
    def apply(
      apiVersion: storageDotk8sDotioSlashv1alpha1,
      kind: typings.pulumiKubernetes.pulumiKubernetesStrings.VolumeAttachment,
      metadata: ObjectMeta,
      spec: VolumeAttachmentSpec,
      status: VolumeAttachmentStatus
    ): VolumeAttachment = {
      val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[VolumeAttachment]
    }
    
    @scala.inline
    implicit class VolumeAttachmentMutableBuilder[Self <: VolumeAttachment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: storageDotk8sDotioSlashv1alpha1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.VolumeAttachment): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpec(value: VolumeAttachmentSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: VolumeAttachmentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.
    */
  @js.native
  trait VolumeAttachmentSource extends StObject {
    
    /**
      * inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod's inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the CSIMigration feature.
      */
    var inlineVolumeSpec: PersistentVolumeSpec = js.native
    
    /**
      * Name of the persistent volume to attach.
      */
    var persistentVolumeName: String = js.native
  }
  object VolumeAttachmentSource {
    
    @scala.inline
    def apply(inlineVolumeSpec: PersistentVolumeSpec, persistentVolumeName: String): VolumeAttachmentSource = {
      val __obj = js.Dynamic.literal(inlineVolumeSpec = inlineVolumeSpec.asInstanceOf[js.Any], persistentVolumeName = persistentVolumeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[VolumeAttachmentSource]
    }
    
    @scala.inline
    implicit class VolumeAttachmentSourceMutableBuilder[Self <: VolumeAttachmentSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInlineVolumeSpec(value: PersistentVolumeSpec): Self = StObject.set(x, "inlineVolumeSpec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentVolumeName(value: String): Self = StObject.set(x, "persistentVolumeName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
    */
  @js.native
  trait VolumeAttachmentSpec extends StObject {
    
    /**
      * Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
      */
    var attacher: String = js.native
    
    /**
      * The node that the volume should be attached to.
      */
    var nodeName: String = js.native
    
    /**
      * Source represents the volume that should be attached.
      */
    var source: VolumeAttachmentSource = js.native
  }
  object VolumeAttachmentSpec {
    
    @scala.inline
    def apply(attacher: String, nodeName: String, source: VolumeAttachmentSource): VolumeAttachmentSpec = {
      val __obj = js.Dynamic.literal(attacher = attacher.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[VolumeAttachmentSpec]
    }
    
    @scala.inline
    implicit class VolumeAttachmentSpecMutableBuilder[Self <: VolumeAttachmentSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttacher(value: String): Self = StObject.set(x, "attacher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: VolumeAttachmentSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * VolumeAttachmentStatus is the status of a VolumeAttachment request.
    */
  @js.native
  trait VolumeAttachmentStatus extends StObject {
    
    /**
      * The last error encountered during attach operation, if any. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
      */
    var attachError: VolumeError = js.native
    
    /**
      * Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
      */
    var attached: Boolean = js.native
    
    /**
      * Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
      */
    var attachmentMetadata: StringDictionary[String] = js.native
    
    /**
      * The last error encountered during detach operation, if any. This field must only be set by the entity completing the detach operation, i.e. the external-attacher.
      */
    var detachError: VolumeError = js.native
  }
  object VolumeAttachmentStatus {
    
    @scala.inline
    def apply(
      attachError: VolumeError,
      attached: Boolean,
      attachmentMetadata: StringDictionary[String],
      detachError: VolumeError
    ): VolumeAttachmentStatus = {
      val __obj = js.Dynamic.literal(attachError = attachError.asInstanceOf[js.Any], attached = attached.asInstanceOf[js.Any], attachmentMetadata = attachmentMetadata.asInstanceOf[js.Any], detachError = detachError.asInstanceOf[js.Any])
      __obj.asInstanceOf[VolumeAttachmentStatus]
    }
    
    @scala.inline
    implicit class VolumeAttachmentStatusMutableBuilder[Self <: VolumeAttachmentStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachError(value: VolumeError): Self = StObject.set(x, "attachError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttached(value: Boolean): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentMetadata(value: StringDictionary[String]): Self = StObject.set(x, "attachmentMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachError(value: VolumeError): Self = StObject.set(x, "detachError", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * VolumeError captures an error encountered during a volume operation.
    */
  @js.native
  trait VolumeError extends StObject {
    
    /**
      * String detailing the error encountered during Attach or Detach operation. This string maybe logged, so it should not contain sensitive information.
      */
    var message: String = js.native
    
    /**
      * Time the error was encountered.
      */
    var time: String = js.native
  }
  object VolumeError {
    
    @scala.inline
    def apply(message: String, time: String): VolumeError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[VolumeError]
    }
    
    @scala.inline
    implicit class VolumeErrorMutableBuilder[Self <: VolumeError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
