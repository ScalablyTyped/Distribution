package typings.ramlDefinitionSystem.ramlDefinitionSystemMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeSystem.Described * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeSystem.IUniverse * / any */ @JSImport("raml-definition-system", "Universe")
@js.native
open class Universe protected () extends StObject {
  def this(dec: IUniverseDescriptor) = this()
  def this(dec: IUniverseDescriptor, name: String) = this()
  def this(dec: IUniverseDescriptor, name: String, _parent: Universe) = this()
  def this(dec: IUniverseDescriptor, name: Unit, _parent: Universe) = this()
  def this(dec: IUniverseDescriptor, name: String, _parent: Unit, v: String) = this()
  def this(dec: IUniverseDescriptor, name: String, _parent: Universe, v: String) = this()
  def this(dec: IUniverseDescriptor, name: Unit, _parent: Unit, v: String) = this()
  def this(dec: IUniverseDescriptor, name: Unit, _parent: Universe, v: String) = this()
  
  /* private */ var _classes: Any = js.native
  
  /* private */ var _originalTopLevelText: Any = js.native
  
  /* private */ var _parent: Any = js.native
  
  /* private */ var _topLevel: Any = js.native
  
  /* private */ var _typedVersion: Any = js.native
  
  /* private */ var _uversion: Any = js.native
  
  /* private */ var aMap: Any = js.native
  
  def getOriginalTopLevelText(): String = js.native
  
  def getTopLevel(): String = js.native
  
  def getTypedVersion(): String = js.native
  
  def matched(): IUniverseDescriptor = js.native
  
  /* private */ var matchedObjects: Any = js.native
  
  def register(t: IType): this.type = js.native
  
  def registerAlias(a: String, t: IType): Unit = js.native
  
  def registerSuperClass(t0: IType, t1: IType): Unit = js.native
  
  def setOriginalTopLevelText(t: String): Unit = js.native
  
  def setTopLevel(t: String): Unit = js.native
  
  def setTypedVersion(tv: String): Unit = js.native
  
  def setUniverseVersion(version: String): Unit = js.native
  
  def `type`(name: String): ITypeDefinition = js.native
  
  def types(): Array = js.native
  
  def unregister(t: IType): this.type = js.native
  
  def version(): String = js.native
}
