package typings.refUnionDi

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.refNapi.mod.Type
import typings.refNapi.mod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The union type meta-constructor. */
object mod {
  
  @scala.inline
  def apply(): UnionType = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[UnionType]
  @scala.inline
  def apply(fields: js.Array[js.Any]): UnionType = ^.asInstanceOf[js.Dynamic].apply(fields.asInstanceOf[js.Any]).asInstanceOf[UnionType]
  @scala.inline
  def apply(fields: js.Object): UnionType = ^.asInstanceOf[js.Dynamic].apply(fields.asInstanceOf[js.Any]).asInstanceOf[UnionType]
  
  @JSImport("ref-union-di", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ref-union-di", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with UnionType {
    def this(fields: js.Array[js.Any]) = this()
    def this(fields: js.Object) = this()
    
    /** To invoke when `ref.get` is invoked on a buffer of this type. */
    /* CompleteClass */
    override def get(buffer: Buffer, offset: Double): js.Any = js.native
    
    /** The current level of indirection of the buffer. */
    /* CompleteClass */
    var indirection: Double = js.native
    
    /** To invoke when `ref.set` is invoked on a buffer of this type. */
    /* CompleteClass */
    override def set(buffer: Buffer, offset: Double, value: js.Any): Unit = js.native
    
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
  Instantiable1[(/* arg */ typings.node.Buffer) | (/* data */ js.Object), js.Any]
       with Instantiable0[js.Any]
       with Instantiable2[/* arg */ typings.node.Buffer, /* data */ js.Object, js.Any] {
    
    def apply(): js.Any = js.native
    /** Pass it an existing Buffer instance to use that as the backing buffer. */
    def apply(arg: typings.node.Buffer): js.Any = js.native
    def apply(arg: typings.node.Buffer, data: js.Object): js.Any = js.native
    def apply(data: js.Object): js.Any = js.native
    
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
    
    var fields: StringDictionary[typings.refUnionDi.anon.Type] = js.native
  }
}
