package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Secret holds secret data of a certain type. The total bytes of the values in the Data field must be less than MaxSecretSize bytes.
  *
  * Note: While Pulumi automatically encrypts the 'data' and 'stringData'
  * fields, this encryption only applies to Pulumi's context, including the state file,
  * the Service, the CLI, etc. Kubernetes does not encrypt Secret resources by default,
  * and the contents are visible to users with access to the Secret in Kubernetes using
  * tools like 'kubectl'.
  *
  * For more information on securing Kubernetes Secrets, see the following links:
  * https://kubernetes.io/docs/concepts/configuration/secret/#security-properties
  * https://kubernetes.io/docs/concepts/configuration/secret/#risks
  */
trait Secret extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: typings.pulumiKubernetes.pulumiKubernetesStrings.v1
  
  /**
    * Data contains the secret data. Each key must consist of alphanumeric characters, '-', '_' or '.'. The serialized form of the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described in https://tools.ietf.org/html/rfc4648#section-4
    */
  var data: StringDictionary[String]
  
  /**
    * Immutable, if set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified). If not set to true, the field can be modified at any time. Defaulted to nil. This is a beta field enabled by ImmutableEphemeralVolumes feature gate.
    */
  var immutable: Boolean
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Secret
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta
  
  /**
    * stringData allows specifying non-binary secret data in string form. It is provided as a write-only convenience method. All keys and values are merged into the data field on write, overwriting any existing values. It is never output when reading from the API.
    */
  var stringData: StringDictionary[String]
  
  /**
    * Used to facilitate programmatic handling of secret data.
    */
  var `type`: String
}
object Secret {
  
  inline def apply(
    data: StringDictionary[String],
    immutable: Boolean,
    metadata: ObjectMeta,
    stringData: StringDictionary[String],
    `type`: String
  ): Secret = {
    val __obj = js.Dynamic.literal(apiVersion = "v1", data = data.asInstanceOf[js.Any], immutable = immutable.asInstanceOf[js.Any], kind = "Secret", metadata = metadata.asInstanceOf[js.Any], stringData = stringData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Secret]
  }
  
  extension [Self <: Secret](x: Self) {
    
    inline def setApiVersion(value: typings.pulumiKubernetes.pulumiKubernetesStrings.v1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
    
    inline def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.Secret): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setStringData(value: StringDictionary[String]): Self = StObject.set(x, "stringData", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
