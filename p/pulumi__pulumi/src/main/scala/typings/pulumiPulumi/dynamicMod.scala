package typings.pulumiPulumi

import typings.pulumiPulumi.outputMod.Inputs
import typings.pulumiPulumi.resourceMod.CustomResource
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamicMod {
  
  @JSImport("@pulumi/pulumi/dynamic", "Resource")
  @js.native
  abstract class Resource protected () extends CustomResource {
    /**
      * Creates a new dynamic resource.
      *
      * @param provider The implementation of the resource's CRUD operations.
      * @param name The name of the resource.
      * @param props The arguments to use to populate the new resource. Must not define the reserved
      *              property "__provider".
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(provider: ResourceProvider, name: String, props: Inputs) = this()
    def this(provider: ResourceProvider, name: String, props: Inputs, opts: CustomResourceOptions) = this()
  }
  
  trait CheckFailure extends StObject {
    
    /**
      * The property that failed validation.
      */
    val property: String
    
    /**
      * The reason that the property failed validation.
      */
    val reason: String
  }
  object CheckFailure {
    
    inline def apply(property: String, reason: String): CheckFailure = {
      val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckFailure]
    }
    
    extension [Self <: CheckFailure](x: Self) {
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  trait CheckResult extends StObject {
    
    /**
      * Any validation failures that occurred.
      */
    val failures: js.UndefOr[js.Array[CheckFailure]] = js.undefined
    
    /**
      * The inputs to use, if any.
      */
    val inputs: js.UndefOr[js.Any] = js.undefined
  }
  object CheckResult {
    
    inline def apply(): CheckResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckResult]
    }
    
    extension [Self <: CheckResult](x: Self) {
      
      inline def setFailures(value: js.Array[CheckFailure]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
      
      inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
      
      inline def setFailuresVarargs(value: CheckFailure*): Self = StObject.set(x, "failures", js.Array(value :_*))
      
      inline def setInputs(value: js.Any): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    }
  }
  
  trait CreateResult extends StObject {
    
    /**
      * The ID of the created resource.
      */
    val id: ID
    
    /**
      * Any properties that were computed during creation.
      */
    val outs: js.UndefOr[js.Any] = js.undefined
  }
  object CreateResult {
    
    inline def apply(id: ID): CreateResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateResult]
    }
    
    extension [Self <: CreateResult](x: Self) {
      
      inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOuts(value: js.Any): Self = StObject.set(x, "outs", value.asInstanceOf[js.Any])
      
      inline def setOutsUndefined: Self = StObject.set(x, "outs", js.undefined)
    }
  }
  
  trait DiffResult extends StObject {
    
    /**
      * If true, this diff detected changes and suggests an update.
      */
    val changes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, and a replacement occurs, the resource will first be deleted before being recreated.  This is to
      * void potential side-by-side issues with the default create before delete behavior.
      */
    val deleteBeforeReplace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If this update requires a replacement, the set of properties triggering it.
      */
    val replaces: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An optional list of properties that will not ever change.
      */
    val stables: js.UndefOr[js.Array[String]] = js.undefined
  }
  object DiffResult {
    
    inline def apply(): DiffResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiffResult]
    }
    
    extension [Self <: DiffResult](x: Self) {
      
      inline def setChanges(value: Boolean): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
      
      inline def setDeleteBeforeReplace(value: Boolean): Self = StObject.set(x, "deleteBeforeReplace", value.asInstanceOf[js.Any])
      
      inline def setDeleteBeforeReplaceUndefined: Self = StObject.set(x, "deleteBeforeReplace", js.undefined)
      
      inline def setReplaces(value: js.Array[String]): Self = StObject.set(x, "replaces", value.asInstanceOf[js.Any])
      
      inline def setReplacesUndefined: Self = StObject.set(x, "replaces", js.undefined)
      
      inline def setReplacesVarargs(value: String*): Self = StObject.set(x, "replaces", js.Array(value :_*))
      
      inline def setStables(value: js.Array[String]): Self = StObject.set(x, "stables", value.asInstanceOf[js.Any])
      
      inline def setStablesUndefined: Self = StObject.set(x, "stables", js.undefined)
      
      inline def setStablesVarargs(value: String*): Self = StObject.set(x, "stables", js.Array(value :_*))
    }
  }
  
  trait ReadResult extends StObject {
    
    /**
      * The ID of the resource ready back (or blank if missing).
      */
    val id: js.UndefOr[ID] = js.undefined
    
    /**
      * The current property state read from the live environment.
      */
    val props: js.UndefOr[js.Any] = js.undefined
  }
  object ReadResult {
    
    inline def apply(): ReadResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadResult]
    }
    
    extension [Self <: ReadResult](x: Self) {
      
      inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
  
  trait ResourceProvider extends StObject {
    
    /**
      * Check validates that the given property bag is valid for a resource of the given type.
      *
      * @param olds The old input properties to use for validation.
      * @param news The new input properties to use for validation.
      */
    var check: js.UndefOr[js.Function2[/* olds */ js.Any, /* news */ js.Any, js.Promise[CheckResult]]] = js.undefined
    
    /**
      * Create allocates a new instance of the provided resource and returns its unique ID afterwards.
      * If this call fails, the resource must not have been created (i.e., it is "transactional").
      *
      * @param inputs The properties to set during creation.
      */
    def create(inputs: js.Any): js.Promise[CreateResult]
    
    /**
      * Delete tears down an existing resource with the given ID.  If it fails, the resource is assumed to still exist.
      *
      * @param id The ID of the resource to delete.
      * @param props The current properties on the resource.
      */
    var delete: js.UndefOr[js.Function2[/* id */ ID, /* props */ js.Any, js.Promise[Unit]]] = js.undefined
    
    /**
      * Diff checks what impacts a hypothetical update will have on the resource's properties.
      *
      * @param id The ID of the resource to diff.
      * @param olds The old values of properties to diff.
      * @param news The new values of properties to diff.
      */
    var diff: js.UndefOr[
        js.Function3[/* id */ ID, /* olds */ js.Any, /* news */ js.Any, js.Promise[DiffResult]]
      ] = js.undefined
    
    /**
      * Reads the current live state associated with a resource.  Enough state must be included in the inputs to uniquely
      * identify the resource; this is typically just the resource ID, but it may also include some properties.
      */
    var read: js.UndefOr[
        js.Function2[/* id */ ID, /* props */ js.UndefOr[js.Any], js.Promise[ReadResult]]
      ] = js.undefined
    
    /**
      * Update updates an existing resource with new values.
      *
      * @param id The ID of the resource to update.
      * @param olds The old values of properties to update.
      * @param news The new values of properties to update.
      */
    var update: js.UndefOr[
        js.Function3[/* id */ ID, /* olds */ js.Any, /* news */ js.Any, js.Promise[UpdateResult]]
      ] = js.undefined
  }
  object ResourceProvider {
    
    inline def apply(create: js.Any => js.Promise[CreateResult]): ResourceProvider = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
      __obj.asInstanceOf[ResourceProvider]
    }
    
    extension [Self <: ResourceProvider](x: Self) {
      
      inline def setCheck(value: (/* olds */ js.Any, /* news */ js.Any) => js.Promise[CheckResult]): Self = StObject.set(x, "check", js.Any.fromFunction2(value))
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setCreate(value: js.Any => js.Promise[CreateResult]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setDelete(value: (/* id */ ID, /* props */ js.Any) => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setDiff(value: (/* id */ ID, /* olds */ js.Any, /* news */ js.Any) => js.Promise[DiffResult]): Self = StObject.set(x, "diff", js.Any.fromFunction3(value))
      
      inline def setDiffUndefined: Self = StObject.set(x, "diff", js.undefined)
      
      inline def setRead(value: (/* id */ ID, /* props */ js.UndefOr[js.Any]) => js.Promise[ReadResult]): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setUpdate(value: (/* id */ ID, /* olds */ js.Any, /* news */ js.Any) => js.Promise[UpdateResult]): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  trait UpdateResult extends StObject {
    
    /**
      * Any properties that were computed during updating.
      */
    val outs: js.UndefOr[js.Any] = js.undefined
  }
  object UpdateResult {
    
    inline def apply(): UpdateResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateResult]
    }
    
    extension [Self <: UpdateResult](x: Self) {
      
      inline def setOuts(value: js.Any): Self = StObject.set(x, "outs", value.asInstanceOf[js.Any])
      
      inline def setOutsUndefined: Self = StObject.set(x, "outs", js.undefined)
    }
  }
}
