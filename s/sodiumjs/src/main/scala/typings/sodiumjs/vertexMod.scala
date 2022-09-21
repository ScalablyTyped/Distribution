package typings.sodiumjs

import typings.typescriptCollections.mod.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vertexMod {
  
  @JSImport("sodiumjs/dist/typings/sodium/Vertex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Color extends StObject
  @JSImport("sodiumjs/dist/typings/sodium/Vertex", "Color")
  @js.native
  object Color extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Color & Double] = js.native
    
    @js.native
    sealed trait black
      extends StObject
         with Color
    /* 0 */ val black: typings.sodiumjs.vertexMod.Color.black & Double = js.native
    
    @js.native
    sealed trait gray
      extends StObject
         with Color
    /* 1 */ val gray: typings.sodiumjs.vertexMod.Color.gray & Double = js.native
    
    @js.native
    sealed trait purple
      extends StObject
         with Color
    /* 3 */ val purple: typings.sodiumjs.vertexMod.Color.purple & Double = js.native
    
    @js.native
    sealed trait white
      extends StObject
         with Color
    /* 2 */ val white: typings.sodiumjs.vertexMod.Color.white & Double = js.native
  }
  
  @JSImport("sodiumjs/dist/typings/sodium/Vertex", "Source")
  @js.native
  open class Source protected () extends StObject {
    def this(origin: Vertex, register_ : js.Function0[js.Function0[Unit]]) = this()
    
    def deregister(target: Vertex): Unit = js.native
    
    /* private */ var deregister_ : Any = js.native
    
    var origin: Vertex = js.native
    
    def register(target: Vertex): Unit = js.native
    
    /* private */ var register_ : Any = js.native
    
    /* private */ var registered: Any = js.native
  }
  
  @JSImport("sodiumjs/dist/typings/sodium/Vertex", "Vertex")
  @js.native
  open class Vertex protected () extends StObject {
    def this(name: String, rank: Double, sources: js.Array[Source]) = this()
    
    def addSource(src: Source): Unit = js.native
    
    var buffered: Boolean = js.native
    
    def children(): js.Array[Vertex] = js.native
    
    var childrn: js.Array[Vertex] = js.native
    
    def collectWhite(): Unit = js.native
    
    var color: Color = js.native
    
    /* private */ var decRefCount: Any = js.native
    
    def decrement(referrer: Vertex): Unit = js.native
    
    def deregister(target: Vertex): Unit = js.native
    
    def descr(): String = js.native
    
    /* private */ var ensureBiggerThan: Any = js.native
    
    def free(): Unit = js.native
    
    var id: Double = js.native
    
    /* private */ var incRefCount: Any = js.native
    
    def increment(referrer: Vertex): Boolean = js.native
    
    def markGray(): Unit = js.native
    
    var name: String = js.native
    
    def possibleRoots(): Unit = js.native
    
    var rank: Double = js.native
    
    def refCount(): Double = js.native
    
    var refCountAdj: Double = js.native
    
    def register(target: Vertex): Boolean = js.native
    
    def release(): Unit = js.native
    
    def scan(): Unit = js.native
    
    def scanBlack(): Unit = js.native
    
    var sources: js.Array[Source] = js.native
    
    var targets: js.Array[Vertex] = js.native
    
    var visited: Boolean = js.native
  }
  /* static members */
  object Vertex {
    
    @JSImport("sodiumjs/dist/typings/sodium/Vertex", "Vertex")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sodiumjs/dist/typings/sodium/Vertex", "Vertex.NULL")
    @js.native
    def NULL: Vertex = js.native
    inline def NULL_=(x: Vertex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL")(x.asInstanceOf[js.Any])
    
    inline def collectCycles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("collectCycles")().asInstanceOf[Unit]
    
    inline def collectRoots(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("collectRoots")().asInstanceOf[Unit]
    
    @JSImport("sodiumjs/dist/typings/sodium/Vertex", "Vertex.collectingCycles")
    @js.native
    def collectingCycles: Boolean = js.native
    inline def collectingCycles_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collectingCycles")(x.asInstanceOf[js.Any])
    
    inline def markRoots(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markRoots")().asInstanceOf[Unit]
    
    inline def scanRoots(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scanRoots")().asInstanceOf[Unit]
    
    @JSImport("sodiumjs/dist/typings/sodium/Vertex", "Vertex.toBeFreedList")
    @js.native
    def toBeFreedList: js.Array[Vertex] = js.native
    inline def toBeFreedList_=(x: js.Array[Vertex]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toBeFreedList")(x.asInstanceOf[js.Any])
  }
  
  inline def describeAll(v: Vertex, visited: Set[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeAll")(v.asInstanceOf[js.Any], visited.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getTotalRegistrations(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTotalRegistrations")().asInstanceOf[Double]
  
  inline def setVerbose(v: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVerbose")(v.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
