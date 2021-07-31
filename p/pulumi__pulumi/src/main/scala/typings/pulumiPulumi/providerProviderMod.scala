package typings.pulumiPulumi

import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Inputs
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import typings.pulumiPulumi.resourceMod.URN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerProviderMod {
  
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
    
    @scala.inline
    def apply(property: String, reason: String): CheckFailure = {
      val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckFailure]
    }
    
    @scala.inline
    implicit class CheckFailureMutableBuilder[Self <: CheckFailure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): CheckResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckResult]
    }
    
    @scala.inline
    implicit class CheckResultMutableBuilder[Self <: CheckResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailures(value: js.Array[CheckFailure]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
      
      @scala.inline
      def setFailuresVarargs(value: CheckFailure*): Self = StObject.set(x, "failures", js.Array(value :_*))
      
      @scala.inline
      def setInputs(value: js.Any): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    }
  }
  
  trait ConstructResult extends StObject {
    
    /**
      * Any state that was computed during construction.
      */
    val state: Inputs
    
    /**
      * The URN of the constructed resource.
      */
    val urn: Input[URN]
  }
  object ConstructResult {
    
    @scala.inline
    def apply(state: Inputs, urn: Input[URN]): ConstructResult = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConstructResult]
    }
    
    @scala.inline
    implicit class ConstructResultMutableBuilder[Self <: ConstructResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setState(value: Inputs): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrn(value: Input[URN]): Self = StObject.set(x, "urn", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(id: ID): CreateResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateResult]
    }
    
    @scala.inline
    implicit class CreateResultMutableBuilder[Self <: CreateResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuts(value: js.Any): Self = StObject.set(x, "outs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutsUndefined: Self = StObject.set(x, "outs", js.undefined)
    }
  }
  
  trait DiffResult extends StObject {
    
    /**
      * If true, this diff detected changes and suggests an update.
      */
    val changes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, and a replacement occurs, the resource will first be deleted before being recreated.  This is to
      * avoid potential side-by-side issues with the default create before delete behavior.
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
    
    @scala.inline
    def apply(): DiffResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiffResult]
    }
    
    @scala.inline
    implicit class DiffResultMutableBuilder[Self <: DiffResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChanges(value: Boolean): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
      
      @scala.inline
      def setDeleteBeforeReplace(value: Boolean): Self = StObject.set(x, "deleteBeforeReplace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteBeforeReplaceUndefined: Self = StObject.set(x, "deleteBeforeReplace", js.undefined)
      
      @scala.inline
      def setReplaces(value: js.Array[String]): Self = StObject.set(x, "replaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacesUndefined: Self = StObject.set(x, "replaces", js.undefined)
      
      @scala.inline
      def setReplacesVarargs(value: String*): Self = StObject.set(x, "replaces", js.Array(value :_*))
      
      @scala.inline
      def setStables(value: js.Array[String]): Self = StObject.set(x, "stables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStablesUndefined: Self = StObject.set(x, "stables", js.undefined)
      
      @scala.inline
      def setStablesVarargs(value: String*): Self = StObject.set(x, "stables", js.Array(value :_*))
    }
  }
  
  trait InvokeResult extends StObject {
    
    /**
      * Any validation failures that occurred.
      */
    val failures: js.UndefOr[js.Array[CheckFailure]] = js.undefined
    
    /**
      * The outputs returned by the invoked function, if any.
      */
    val outputs: js.UndefOr[js.Any] = js.undefined
  }
  object InvokeResult {
    
    @scala.inline
    def apply(): InvokeResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvokeResult]
    }
    
    @scala.inline
    implicit class InvokeResultMutableBuilder[Self <: InvokeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailures(value: js.Array[CheckFailure]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
      
      @scala.inline
      def setFailuresVarargs(value: CheckFailure*): Self = StObject.set(x, "failures", js.Array(value :_*))
      
      @scala.inline
      def setOutputs(value: js.Any): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    }
  }
  
  trait Provider extends StObject {
    
    /**
      * Check validates that the given property bag is valid for a resource of the given type.
      *
      * @param olds The old input properties to use for validation.
      * @param news The new input properties to use for validation.
      */
    var check: js.UndefOr[
        js.Function3[/* urn */ URN, /* olds */ js.Any, /* news */ js.Any, js.Promise[CheckResult]]
      ] = js.undefined
    
    /**
      * Construct creates a new component resource.
      *
      * @param name The name of the resource to create.
      * @param type The type of the resource to create.
      * @param inputs The inputs to the resource.
      * @param options the options for the resource.
      */
    var construct: js.UndefOr[
        js.Function4[
          /* name */ String, 
          /* type */ String, 
          /* inputs */ Inputs, 
          /* options */ ComponentResourceOptions, 
          js.Promise[ConstructResult]
        ]
      ] = js.undefined
    
    /**
      * Create allocates a new instance of the provided resource and returns its unique ID afterwards.
      * If this call fails, the resource must not have been created (i.e., it is "transactional").
      *
      * @param inputs The properties to set during creation.
      */
    var create: js.UndefOr[js.Function2[/* urn */ URN, /* inputs */ js.Any, js.Promise[CreateResult]]] = js.undefined
    
    /**
      * Delete tears down an existing resource with the given ID.  If it fails, the resource is assumed to still exist.
      *
      * @param id The ID of the resource to delete.
      * @param props The current properties on the resource.
      */
    var delete: js.UndefOr[js.Function3[/* id */ ID, /* urn */ URN, /* props */ js.Any, js.Promise[Unit]]] = js.undefined
    
    /**
      * Diff checks what impacts a hypothetical update will have on the resource's properties.
      *
      * @param id The ID of the resource to diff.
      * @param olds The old values of properties to diff.
      * @param news The new values of properties to diff.
      */
    var diff: js.UndefOr[
        js.Function4[/* id */ ID, /* urn */ URN, /* olds */ js.Any, /* news */ js.Any, js.Promise[DiffResult]]
      ] = js.undefined
    
    /**
      * Invoke calls the indicated function.
      *
      * @param token The token of the function to call.
      * @param inputs The inputs to the function.
      */
    var invoke: js.UndefOr[js.Function2[/* token */ String, /* inputs */ js.Any, js.Promise[InvokeResult]]] = js.undefined
    
    /**
      * Reads the current live state associated with a resource.  Enough state must be included in the inputs to uniquely
      * identify the resource; this is typically just the resource ID, but it may also include some properties.
      */
    var read: js.UndefOr[
        js.Function3[/* id */ ID, /* urn */ URN, /* props */ js.UndefOr[js.Any], js.Promise[ReadResult]]
      ] = js.undefined
    
    /**
      * Update updates an existing resource with new values.
      *
      * @param id The ID of the resource to update.
      * @param olds The old values of properties to update.
      * @param news The new values of properties to update.
      */
    var update: js.UndefOr[
        js.Function4[
          /* id */ ID, 
          /* urn */ URN, 
          /* olds */ js.Any, 
          /* news */ js.Any, 
          js.Promise[UpdateResult]
        ]
      ] = js.undefined
    
    /**
      * The version of the provider. Must be valid semver.
      */
    var version: String
  }
  object Provider {
    
    @scala.inline
    def apply(version: String): Provider = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Provider]
    }
    
    @scala.inline
    implicit class ProviderMutableBuilder[Self <: Provider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheck(value: (/* urn */ URN, /* olds */ js.Any, /* news */ js.Any) => js.Promise[CheckResult]): Self = StObject.set(x, "check", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      @scala.inline
      def setConstruct(
        value: (/* name */ String, /* type */ String, /* inputs */ Inputs, /* options */ ComponentResourceOptions) => js.Promise[ConstructResult]
      ): Self = StObject.set(x, "construct", js.Any.fromFunction4(value))
      
      @scala.inline
      def setConstructUndefined: Self = StObject.set(x, "construct", js.undefined)
      
      @scala.inline
      def setCreate(value: (/* urn */ URN, /* inputs */ js.Any) => js.Promise[CreateResult]): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setDelete(value: (/* id */ ID, /* urn */ URN, /* props */ js.Any) => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      @scala.inline
      def setDiff(
        value: (/* id */ ID, /* urn */ URN, /* olds */ js.Any, /* news */ js.Any) => js.Promise[DiffResult]
      ): Self = StObject.set(x, "diff", js.Any.fromFunction4(value))
      
      @scala.inline
      def setDiffUndefined: Self = StObject.set(x, "diff", js.undefined)
      
      @scala.inline
      def setInvoke(value: (/* token */ String, /* inputs */ js.Any) => js.Promise[InvokeResult]): Self = StObject.set(x, "invoke", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInvokeUndefined: Self = StObject.set(x, "invoke", js.undefined)
      
      @scala.inline
      def setRead(value: (/* id */ ID, /* urn */ URN, /* props */ js.UndefOr[js.Any]) => js.Promise[ReadResult]): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setUpdate(
        value: (/* id */ ID, /* urn */ URN, /* olds */ js.Any, /* news */ js.Any) => js.Promise[UpdateResult]
      ): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): ReadResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadResult]
    }
    
    @scala.inline
    implicit class ReadResultMutableBuilder[Self <: ReadResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
  
  trait UpdateResult extends StObject {
    
    /**
      * Any properties that were computed during updating.
      */
    val outs: js.UndefOr[js.Any] = js.undefined
  }
  object UpdateResult {
    
    @scala.inline
    def apply(): UpdateResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateResult]
    }
    
    @scala.inline
    implicit class UpdateResultMutableBuilder[Self <: UpdateResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOuts(value: js.Any): Self = StObject.set(x, "outs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutsUndefined: Self = StObject.set(x, "outs", js.undefined)
    }
  }
}
