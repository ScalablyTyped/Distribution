package typings
package atPulumiKubernetesLib.typesInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "scheduling")
@js.native
object schedulingNs extends js.Object {
  @JSName("v1alpha1")
  @js.native
  object v1alpha1Ns extends js.Object {
    /**
             * PriorityClass defines mapping from a priority class name to the priority integer value. The
             * value can be any valid integer.
             */
    
    trait PriorityClass extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * description is an arbitrary string that usually provides guidelines on when this priority
                   * class should be used.
                   */
      var description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * globalDefault specifies whether this PriorityClass should be considered as the default
                   * priority for pods that do not have any priority class.
                   */
      var globalDefault: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * The value of this priority class. This is the actual priority that pods receive when they
                   * have the name of this class in their pod spec.
                   */
      var value: atPulumiPulumiLib.resourceMod.Input[scala.Double]
    }
    
    /**
             * PriorityClassList is a collection of priority classes.
             */
    
    trait PriorityClassList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * items is the list of PriorityClasses
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[PriorityClass]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata More info:
                   * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    def isPriorityClass(o: js.Any): /* is PriorityClass */scala.Boolean = js.native
    def isPriorityClassList(o: js.Any): /* is PriorityClassList */scala.Boolean = js.native
  }
  
}

