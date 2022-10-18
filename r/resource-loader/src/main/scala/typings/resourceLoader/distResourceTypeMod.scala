package typings.resourceLoader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distResourceTypeMod {
  
  @js.native
  sealed trait ResourceState extends StObject
  @JSImport("resource-loader/dist/resource_type", "ResourceState")
  @js.native
  object ResourceState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ResourceState & Double] = js.native
    
    @js.native
    sealed trait Complete
      extends StObject
         with ResourceState
    /* 2 */ val Complete: typings.resourceLoader.distResourceTypeMod.ResourceState.Complete & Double = js.native
    
    @js.native
    sealed trait Loading
      extends StObject
         with ResourceState
    /* 1 */ val Loading: typings.resourceLoader.distResourceTypeMod.ResourceState.Loading & Double = js.native
    
    @js.native
    sealed trait NotStarted
      extends StObject
         with ResourceState
    /* 0 */ val NotStarted: typings.resourceLoader.distResourceTypeMod.ResourceState.NotStarted & Double = js.native
  }
  
  @js.native
  sealed trait ResourceType extends StObject
  @JSImport("resource-loader/dist/resource_type", "ResourceType")
  @js.native
  object ResourceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ResourceType & Double] = js.native
    
    @js.native
    sealed trait Audio
      extends StObject
         with ResourceType
    /* 6 */ val Audio: typings.resourceLoader.distResourceTypeMod.ResourceType.Audio & Double = js.native
    
    @js.native
    sealed trait Blob
      extends StObject
         with ResourceType
    /* 2 */ val Blob: typings.resourceLoader.distResourceTypeMod.ResourceType.Blob & Double = js.native
    
    @js.native
    sealed trait Buffer
      extends StObject
         with ResourceType
    /* 1 */ val Buffer: typings.resourceLoader.distResourceTypeMod.ResourceType.Buffer & Double = js.native
    
    @js.native
    sealed trait Image
      extends StObject
         with ResourceType
    /* 5 */ val Image: typings.resourceLoader.distResourceTypeMod.ResourceType.Image & Double = js.native
    
    @js.native
    sealed trait Json
      extends StObject
         with ResourceType
    /* 3 */ val Json: typings.resourceLoader.distResourceTypeMod.ResourceType.Json & Double = js.native
    
    @js.native
    sealed trait Text
      extends StObject
         with ResourceType
    /* 8 */ val Text: typings.resourceLoader.distResourceTypeMod.ResourceType.Text & Double = js.native
    
    @js.native
    sealed trait Unknown
      extends StObject
         with ResourceType
    /* 0 */ val Unknown: typings.resourceLoader.distResourceTypeMod.ResourceType.Unknown & Double = js.native
    
    @js.native
    sealed trait Video
      extends StObject
         with ResourceType
    /* 7 */ val Video: typings.resourceLoader.distResourceTypeMod.ResourceType.Video & Double = js.native
    
    @js.native
    sealed trait Xml
      extends StObject
         with ResourceType
    /* 4 */ val Xml: typings.resourceLoader.distResourceTypeMod.ResourceType.Xml & Double = js.native
  }
}
