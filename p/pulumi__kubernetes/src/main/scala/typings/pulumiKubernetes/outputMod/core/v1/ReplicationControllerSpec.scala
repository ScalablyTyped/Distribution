package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ReplicationControllerSpec is the specification of a replication controller.
  */
trait ReplicationControllerSpec extends StObject {
  
  /**
    * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
    */
  var minReadySeconds: Double
  
  /**
    * Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
    */
  var replicas: Double
  
  /**
    * Selector is a label query over pods that should match the Replicas count. If Selector is empty, it is defaulted to the labels present on the Pod template. Label keys and values that must match in order to be controlled by this replication controller, if empty defaulted to labels on Pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  var selector: StringDictionary[String]
  
  /**
    * Template is the object that describes the pod that will be created if insufficient replicas are detected. This takes precedence over a TemplateRef. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
    */
  var template: PodTemplateSpec
}
object ReplicationControllerSpec {
  
  @scala.inline
  def apply(
    minReadySeconds: Double,
    replicas: Double,
    selector: StringDictionary[String],
    template: PodTemplateSpec
  ): ReplicationControllerSpec = {
    val __obj = js.Dynamic.literal(minReadySeconds = minReadySeconds.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationControllerSpec]
  }
  
  @scala.inline
  implicit class ReplicationControllerSpecMutableBuilder[Self <: ReplicationControllerSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinReadySeconds(value: Double): Self = StObject.set(x, "minReadySeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicas(value: Double): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: StringDictionary[String]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: PodTemplateSpec): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
