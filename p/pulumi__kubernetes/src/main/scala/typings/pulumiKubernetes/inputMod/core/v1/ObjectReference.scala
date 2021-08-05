package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ObjectReference contains enough information to let you inspect or modify the referred object.
  */
trait ObjectReference extends StObject {
  
  /**
    * API version of the referent.
    */
  var apiVersion: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * If referring to a piece of an object instead of an entire object, this string should contain a valid JSON/Go field access statement, such as desiredState.manifest.containers[2]. For example, if the object reference is to a container within a pod, this would take on a value like: "spec.containers{name}" (where "name" refers to the name of the container that triggered the event) or if no container name is specified "spec.containers[2]" (container with index 2 in this pod). This syntax is chosen only to have some well-defined way of referencing a part of an object.
    */
  var fieldPath: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Namespace of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
    */
  var namespace: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Specific resourceVersion to which this reference is made, if any. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
    */
  var resourceVersion: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids
    */
  var uid: js.UndefOr[Input[String]] = js.undefined
}
object ObjectReference {
  
  inline def apply(): ObjectReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectReference]
  }
  
  extension [Self <: ObjectReference](x: Self) {
    
    inline def setApiVersion(value: Input[String]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setFieldPath(value: Input[String]): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    inline def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
    
    inline def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setResourceVersion(value: Input[String]): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
    
    inline def setResourceVersionUndefined: Self = StObject.set(x, "resourceVersion", js.undefined)
    
    inline def setUid(value: Input[String]): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
