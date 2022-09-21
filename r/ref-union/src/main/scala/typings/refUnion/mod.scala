package typings.refUnion

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.ref.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The union type meta-constructor. */
object mod {
  
  inline def apply(): UnionType = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[UnionType]
  inline def apply(fields: js.Array[Any]): UnionType = ^.asInstanceOf[js.Dynamic].apply(fields.asInstanceOf[js.Any]).asInstanceOf[UnionType]
  inline def apply(fields: js.Object): UnionType = ^.asInstanceOf[js.Dynamic].apply(fields.asInstanceOf[js.Any]).asInstanceOf[UnionType]
  
  @JSImport("ref-union", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ref-union", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with UnionType {
    def this(fields: js.Array[Any]) = this()
    def this(fields: js.Object) = this()
    
    /** To invoke when `ref.get` is invoked on a buffer of this type. */
    /* CompleteClass */
    override def get(buffer: Buffer, offset: Double): Any = js.native
    
    /** The current level of indirection of the buffer. */
    /* CompleteClass */
    var indirection: Double = js.native
    
    /** To invoke when `ref.set` is invoked on a buffer of this type. */
    /* CompleteClass */
    override def set(buffer: Buffer, offset: Double, value: Any): Unit = js.native
    
    /** The size in bytes required to hold this datatype. */
    /* CompleteClass */
    var size: Double = js.native
  }
  
  /**
    * This is the `constructor` of the Struct type that gets returned.
    *
    * Invoke it with `new` to create a new Buffer instance backing the union.
    * Pass it an existing Buffer instance to use that as the backing buffer.
    * Pass in an Object containing the union fields to auto-populate the
    * union with the data.
    *
    * @constructor
    */
  @js.native
  trait UnionType
    extends StObject
       with Type
       with /** Pass it an existing Buffer instance to use that as the backing buffer. */
  Instantiable1[(/* arg */ Buffer) | (/* data */ js.Object), Any]
       with Instantiable0[Any]
       with Instantiable2[/* arg */ Buffer, /* data */ js.Object, Any] {
    
    def apply(): Any = js.native
    /** Pass it an existing Buffer instance to use that as the backing buffer. */
    def apply(arg: Buffer): Any = js.native
    def apply(arg: Buffer, data: js.Object): Any = js.native
    def apply(data: js.Object): Any = js.native
    
    /**
      * Adds a new field to the union instance with the given name and type.
      * Note that this function will throw an Error if any instances of the union
      * type have already been created, therefore this function must be called at the
      * beginning, before any instances are created.
      */
    def defineProperty(name: String, `type`: String): Unit = js.native
    /**
      * Adds a new field to the union instance with the given name and type.
      * Note that this function will throw an Error if any instances of the union
      * type have already been created, therefore this function must be called at the
      * beginning, before any instances are created.
      */
    def defineProperty(name: String, `type`: Type): Unit = js.native
    
    var fields: StringDictionary[typings.refUnion.anon.Type] = js.native
  }
}
