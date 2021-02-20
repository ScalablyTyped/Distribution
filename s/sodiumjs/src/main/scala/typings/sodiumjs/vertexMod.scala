package typings.sodiumjs

import typings.typescriptCollections.mod.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vertexMod {
  
  @js.native
  sealed trait Color extends StObject
  @JSImport("sodiumjs/dist/typings/sodium/Vertex", "Color")
  @js.native
  object Color extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Color with Double] = js.native
    
    @js.native
    sealed trait black extends Color
    /* 0 */ val black: typings.sodiumjs.vertexMod.Color.black with Double = js.native
    
    @js.native
    sealed trait gray extends Color
    /* 1 */ val gray: typings.sodiumjs.vertexMod.Color.gray with Double = js.native
    
    @js.native
    sealed trait purple extends Color
    /* 3 */ val purple: typings.sodiumjs.vertexMod.Color.purple with Double = js.native
    
    @js.native
    sealed trait white extends Color
    /* 2 */ val white: typings.sodiumjs.vertexMod.Color.white with Double = js.native
  }
  
  @JSImport("sodiumjs/dist/typings/sodium/Vertex", "Source")
  @js.native
  class Source protected () extends StObject {
    def this(origin: Vertex, register_ : js.Function0[js.Function0[Unit]]) = this()
    
    def deregister(target: Vertex): Unit = js.native
    
    var deregister_ : js.Any = js.native
    
    var origin: Vertex = js.native
    
    def register(target: Vertex): Unit = js.native
    
    var register_ : js.Any = js.native
    
    var registered: js.Any = js.native
  }
  
  @JSImport("sodiumjs/dist/typings/sodium/Vertex", "Vertex")
  @js.native
  class Vertex protected () extends StObject {
    def this(name: String, rank: Double, sources: js.Array[Source]) = this()
    
    def addSource(src: Source): Unit = js.native
    
    var buffered: Boolean = js.native
    
    def children(): js.Array[Vertex] = js.native
    
    var childrn: js.Array[Vertex] = js.native
    
    def collectWhite(): Unit = js.native
    
    var color: Color = js.native
    
    var decRefCount: js.Any = js.native
    
    def decrement(referrer: Vertex): Unit = js.native
    
    def deregister(target: Vertex): Unit = js.native
    
    def descr(): String = js.native
    
    var ensureBiggerThan: js.Any = js.native
    
    def free(): Unit = js.native
    
    var id: Double = js.native
    
    var incRefCount: js.Any = js.native
    
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
    @scala.inline
    def NULL_=(x: Vertex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL")(x.asInstanceOf[js.Any])
    
    @JSImport("sodiumjs/dist/typings/sodium/Vertex", "Vertex.collectCycles")
    @js.native
    def collectCycles(): Unit = js.native
    
    @JSImport("sodiumjs/dist/typings/sodium/Vertex", "Vertex.collectRoots")
    @js.native
    def collectRoots(): Unit = js.native
    
    @JSImport("sodiumjs/dist/typings/sodium/Vertex", "Vertex.collectingCycles")
    @js.native
    def collectingCycles: Boolean = js.native
    @scala.inline
    def collectingCycles_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collectingCycles")(x.asInstanceOf[js.Any])
    
    @JSImport("sodiumjs/dist/typings/sodium/Vertex", "Vertex.markRoots")
    @js.native
    def markRoots(): Unit = js.native
    
    @JSImport("sodiumjs/dist/typings/sodium/Vertex", "Vertex.scanRoots")
    @js.native
    def scanRoots(): Unit = js.native
    
    @JSImport("sodiumjs/dist/typings/sodium/Vertex", "Vertex.toBeFreedList")
    @js.native
    def toBeFreedList: js.Array[Vertex] = js.native
    @scala.inline
    def toBeFreedList_=(x: js.Array[Vertex]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toBeFreedList")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sodiumjs/dist/typings/sodium/Vertex", "describeAll")
  @js.native
  def describeAll(v: Vertex, visited: Set[Double]): Unit = js.native
  
  @JSImport("sodiumjs/dist/typings/sodium/Vertex", "getTotalRegistrations")
  @js.native
  def getTotalRegistrations(): Double = js.native
  
  @JSImport("sodiumjs/dist/typings/sodium/Vertex", "setVerbose")
  @js.native
  def setVerbose(v: Boolean): Unit = js.native
}
