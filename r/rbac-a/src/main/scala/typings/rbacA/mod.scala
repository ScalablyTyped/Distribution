package typings.rbacA

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.rbacA.anon.Attributes
import typings.rbacA.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rbac-a", "AttributesManager")
  @js.native
  class AttributesManager () extends StObject {
    
    /* protected */ var _attributes: StringDictionary[AttributeFunction] = js.native
    
    /**
      * Undefine an attribute, by name or function and return removed
      * attribute function if one was found.
      */
    def remove(attribute: String): AttributeFunction = js.native
    def remove(attribute: AttributeFunction): AttributeFunction = js.native
    
    /** Define an attribute. The returned value is self for chaining. */
    def set(attribute: AttributeFunction): this.type = js.native
    
    /**
      * Validate the attribute with the specified user, role and parameters.
      * The method will return a truthy value if the attribute valid, or a
      * falsy otherwise.
      * The method may also return a promise resolivng to the expected returne
      * value, or reject. A rejected promise should be considered falsy.
      * If the specified attribute does not exist, false is returned.
      */
    def validate(attribute: String, user: js.Any, role: String, params: js.Object): js.Any = js.native
  }
  
  @JSImport("rbac-a", "Provider")
  @js.native
  class Provider () extends StObject {
    
    /**
      * Return all attributes for the specified role. The return value must
      * be an array. Return an empty array if role is missing or if no
      * attributes for the specified role.
      * Ex: ['attribute1', 'attribute2', ... ]
      * The method mey return a promise resolving with the
      * expected return value.
      */
    def getAttributes(role: String): js.Array[String] | js.Promise[js.Array[String]] = js.native
    
    /**
      * Return all permissions for the specified role. The return value
      * must be an array. Return an empty array if role is missing or
      * no permission for the specified role.
      * Ex: ['permission1', 'permission2', ... ]
      * The method mey return a promise resolving with the
      * expected return value.
      */
    def getPermission(role: String): js.Array[String] | js.Promise[js.Array[String]] = js.native
    
    /**
      * Return all the roles available for the given user. The return value
      * must be an object, recursively defining the associated roles for the
      * specified user. Return an empty object if user has no roles.
      * Ex: {
      *       "role1": {
      *         "role1.1": null,
      *         "role1.2": { ... },
      *         ...
      *       },
      *       "secondary": ...,
      *       ...
      *     }
      * The method mey return a promise resolving with the
      * expected return value.
      */
    def getRoles(user: js.Any): Roles | js.Promise[Roles] = js.native
  }
  
  object Providers {
    
    @JSImport("rbac-a", "Providers")
    @js.native
    val ^ : js.Any = js.native
    
    /** Basic JSON permissions provider */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rbac-a", "Providers.JsonProvider")
    @js.native
    class JsonProvider protected () extends Provider {
      def this(roles: js.Object) = this()
    }
    /** Basic JSON permissions provider */
    @JSImport("rbac-a", "Providers.JsonProvider")
    @js.native
    def JsonProvider: Instantiable = js.native
    inline def JsonProvider_=(x: Instantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JsonProvider")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rbac-a", "RBAC")
  @js.native
  class RBAC[P /* <: Provider */, AM /* <: AttributesManager */] protected () extends EventEmitter {
    def this(opts: Attributes[P, AM]) = this()
    
    val attributes: AM = js.native
    
    /**
      * Check the user for the given permissions. The method will return
      * a Promise resolving with a number. If the user has sufficient
      * access to the specified permissions, the promise should resolve
      * with a positive, non-zero value, or with NaN otherwise. If the
      * Promise is rejected, it should be considered as if the user has
      * insufficient access to the specified ressources.
      */
    def check(user: js.Any, permission: String): js.Promise[Double] = js.native
    def check(user: js.Any, permission: String, params: js.Object): js.Promise[Double] = js.native
    def check(user: js.Any, permission: js.Array[String]): js.Promise[Double] = js.native
    def check(user: js.Any, permission: js.Array[String], params: js.Object): js.Promise[Double] = js.native
    
    val provider: P = js.native
  }
  
  type AttributeFunction = js.Function3[/* user */ js.Any, /* role */ String, /* params */ js.Object, js.Any]
  
  trait Roles
    extends StObject
       with /* _ */ StringDictionary[Double | Roles]
  object Roles {
    
    inline def apply(): Roles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Roles]
    }
  }
}
