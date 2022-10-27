package typings.ropeSequence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("rope-sequence/dist", JSImport.Default)
  @js.native
  open class default[T] ()
    extends StObject
       with RopeSequence[T]
  /* static members */
  object default {
    
    @JSImport("rope-sequence/dist", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rope-sequence/dist", "default.empty")
    @js.native
    def empty: RopeSequence[Any] = js.native
    inline def empty_=(x: RopeSequence[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
    
    inline def from[T](value: js.Array[T]): RopeSequence[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[RopeSequence[T]]
    inline def from[T](value: RopeSequence[T]): RopeSequence[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[RopeSequence[T]]
  }
  
  @js.native
  trait RopeSequence[T] extends StObject {
    
    def append(other: js.Array[T]): RopeSequence[T] = js.native
    def append(other: RopeSequence[T]): RopeSequence[T] = js.native
    
    def forEach(f: js.Function2[/* elt */ T, /* index */ Double, Boolean | Unit]): Unit = js.native
    def forEach(f: js.Function2[/* elt */ T, /* index */ Double, Boolean | Unit], from: Double): Unit = js.native
    def forEach(f: js.Function2[/* elt */ T, /* index */ Double, Boolean | Unit], from: Double, to: Double): Unit = js.native
    def forEach(f: js.Function2[/* elt */ T, /* index */ Double, Boolean | Unit], from: Unit, to: Double): Unit = js.native
    
    def get(i: Double): T = js.native
    
    var length: Double = js.native
    
    def map[U](f: js.Function2[/* elt */ T, /* index */ Double, U]): js.Array[U] = js.native
    def map[U](f: js.Function2[/* elt */ T, /* index */ Double, U], from: Double): js.Array[U] = js.native
    def map[U](f: js.Function2[/* elt */ T, /* index */ Double, U], from: Double, to: Double): js.Array[U] = js.native
    def map[U](f: js.Function2[/* elt */ T, /* index */ Double, U], from: Unit, to: Double): js.Array[U] = js.native
    
    def prepend(other: js.Array[T]): RopeSequence[T] = js.native
    def prepend(other: RopeSequence[T]): RopeSequence[T] = js.native
    
    def slice(from: Double): RopeSequence[T] = js.native
    def slice(from: Double, to: Double): RopeSequence[T] = js.native
  }
}
