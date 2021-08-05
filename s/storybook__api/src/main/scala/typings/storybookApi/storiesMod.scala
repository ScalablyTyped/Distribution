package typings.storybookApi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.storybookApi.anon.DictparameterName
import typings.storybookApi.anon.DocsOnly
import typings.storybookApi.anon.Error
import typings.storybookApi.anon.Provider
import typings.storybookApi.anon.Stories
import typings.storybookApi.mod.Args
import typings.storybookApi.mod.StoryId
import typings.storybookApi.mod.StoryKind
import typings.storybookApi.storybookApiBooleans.`false`
import typings.storybookApi.storybookApiBooleans.`true`
import typings.storybookApi.storybookApiNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storiesMod {
  
  @JSImport("@storybook/api/dist/lib/stories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def denormalizeStoryParameters(hasGlobalParametersKindParametersStories: SetStoriesPayload): StoriesRaw = ^.asInstanceOf[js.Dynamic].applyDynamic("denormalizeStoryParameters")(hasGlobalParametersKindParametersStories.asInstanceOf[js.Any]).asInstanceOf[StoriesRaw]
  
  inline def isGroup(item: Item): /* is @storybook/api.@storybook/api/dist/lib/stories.Group */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGroup")(item.asInstanceOf[js.Any]).asInstanceOf[/* is @storybook/api.@storybook/api/dist/lib/stories.Group */ Boolean]
  
  inline def isRoot(item: Item): /* is @storybook/api.@storybook/api/dist/lib/stories.Root */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRoot")(item.asInstanceOf[js.Any]).asInstanceOf[/* is @storybook/api.@storybook/api/dist/lib/stories.Root */ Boolean]
  
  inline def isStory(item: Item): /* is @storybook/api.@storybook/api/dist/lib/stories.Story */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStory")(item.asInstanceOf[js.Any]).asInstanceOf[/* is @storybook/api.@storybook/api/dist/lib/stories.Story */ Boolean]
  
  inline def transformStoriesRawToStoriesHash(input: StoriesRaw, hasProvider: Provider): StoriesHash = (^.asInstanceOf[js.Dynamic].applyDynamic("transformStoriesRawToStoriesHash")(input.asInstanceOf[js.Any], hasProvider.asInstanceOf[js.Any])).asInstanceOf[StoriesHash]
  
  trait Group extends StObject {
    
    var children: js.Array[StoryId]
    
    var depth: Double
    
    var id: StoryId
    
    var isComponent: Boolean
    
    var isLeaf: `false`
    
    var isRoot: `false`
    
    var name: String
    
    var parameters: js.UndefOr[DocsOnly] = js.undefined
    
    var parent: js.UndefOr[StoryId] = js.undefined
    
    var refId: js.UndefOr[String] = js.undefined
  }
  object Group {
    
    inline def apply(children: js.Array[StoryId], depth: Double, id: StoryId, isComponent: Boolean, name: String): Group = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isLeaf = false, isRoot = false, name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Group]
    }
    
    extension [Self <: Group](x: Self) {
      
      inline def setChildren(value: js.Array[StoryId]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: StoryId*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setId(value: StoryId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsComponent(value: Boolean): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
      
      inline def setIsLeaf(value: `false`): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setIsRoot(value: `false`): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: DocsOnly): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParent(value: StoryId): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
    }
  }
  
  type GroupsList = js.Array[Root | Group]
  
  /* Inlined @storybook/api.@storybook/api/dist/lib/stories.StoriesHash[keyof @storybook/api.@storybook/api/dist/lib/stories.StoriesHash] */
  /* Rewritten from type alias, can be one of: 
    - typings.storybookApi.storybookApiStrings.kind
    - typings.storybookApi.storybookApiStrings.children
    - typings.storybookApi.storybookApiStrings.refId
    - typings.storybookApi.storybookApiStrings.isComponent
    - typings.storybookApi.storybookApiStrings.depth
    - typings.storybookApi.storybookApiStrings.parent
    - typings.storybookApi.storybookApiStrings.isLeaf
    - typings.storybookApi.storybookApiStrings.args
    - typings.storybookApi.storybookApiStrings.parameters
    - typings.storybookApi.storybookApiStrings.name
    - typings.storybookApi.storybookApiStrings.id
    - typings.storybookApi.storybookApiStrings.isRoot
  */
  trait Item extends StObject
  object Item {
    
    inline def args: typings.storybookApi.storybookApiStrings.args = "args".asInstanceOf[typings.storybookApi.storybookApiStrings.args]
    
    inline def children: typings.storybookApi.storybookApiStrings.children = "children".asInstanceOf[typings.storybookApi.storybookApiStrings.children]
    
    inline def depth: typings.storybookApi.storybookApiStrings.depth = "depth".asInstanceOf[typings.storybookApi.storybookApiStrings.depth]
    
    inline def id: typings.storybookApi.storybookApiStrings.id = "id".asInstanceOf[typings.storybookApi.storybookApiStrings.id]
    
    inline def isComponent: typings.storybookApi.storybookApiStrings.isComponent = "isComponent".asInstanceOf[typings.storybookApi.storybookApiStrings.isComponent]
    
    inline def isLeaf: typings.storybookApi.storybookApiStrings.isLeaf = "isLeaf".asInstanceOf[typings.storybookApi.storybookApiStrings.isLeaf]
    
    inline def isRoot: typings.storybookApi.storybookApiStrings.isRoot = "isRoot".asInstanceOf[typings.storybookApi.storybookApiStrings.isRoot]
    
    inline def kind: typings.storybookApi.storybookApiStrings.kind = "kind".asInstanceOf[typings.storybookApi.storybookApiStrings.kind]
    
    inline def name: typings.storybookApi.storybookApiStrings.name = "name".asInstanceOf[typings.storybookApi.storybookApiStrings.name]
    
    inline def parameters: typings.storybookApi.storybookApiStrings.parameters = "parameters".asInstanceOf[typings.storybookApi.storybookApiStrings.parameters]
    
    inline def parent: typings.storybookApi.storybookApiStrings.parent = "parent".asInstanceOf[typings.storybookApi.storybookApiStrings.parent]
    
    inline def refId: typings.storybookApi.storybookApiStrings.refId = "refId".asInstanceOf[typings.storybookApi.storybookApiStrings.refId]
  }
  
  trait Root extends StObject {
    
    var children: js.Array[StoryId]
    
    var depth: `0`
    
    var id: StoryId
    
    var isComponent: `false`
    
    var isLeaf: `false`
    
    var isRoot: `true`
    
    var name: String
    
    var refId: js.UndefOr[String] = js.undefined
  }
  object Root {
    
    inline def apply(children: js.Array[StoryId], id: StoryId, name: String): Root = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], depth = 0, id = id.asInstanceOf[js.Any], isComponent = false, isLeaf = false, isRoot = true, name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Root]
    }
    
    extension [Self <: Root](x: Self) {
      
      inline def setChildren(value: js.Array[StoryId]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: StoryId*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setDepth(value: `0`): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setId(value: StoryId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsComponent(value: `false`): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
      
      inline def setIsLeaf(value: `false`): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setIsRoot(value: `true`): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
    }
  }
  
  type SetStoriesPayload = Error | (Stories & (Record[String, scala.Nothing]))
  
  type StoriesHash = StringDictionary[Root | Group | Story]
  
  type StoriesList = js.Array[Group | Story]
  
  type StoriesRaw = StringDictionary[StoryInput]
  
  trait Story extends StObject {
    
    var args: Args
    
    var children: js.UndefOr[js.Array[StoryId]] = js.undefined
    
    var depth: Double
    
    var id: StoryId
    
    var isComponent: Boolean
    
    var isLeaf: `true`
    
    var isRoot: `false`
    
    var kind: StoryKind
    
    var name: String
    
    var parameters: js.UndefOr[DictparameterName] = js.undefined
    
    var parent: StoryId
    
    var refId: js.UndefOr[String] = js.undefined
  }
  object Story {
    
    inline def apply(
      args: Args,
      depth: Double,
      id: StoryId,
      isComponent: Boolean,
      kind: StoryKind,
      name: String,
      parent: StoryId
    ): Story = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isLeaf = true, isRoot = false, kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Story]
    }
    
    extension [Self <: Story](x: Self) {
      
      inline def setArgs(value: Args): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[StoryId]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: StoryId*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setId(value: StoryId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsComponent(value: Boolean): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
      
      inline def setIsLeaf(value: `true`): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setIsRoot(value: `false`): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
      
      inline def setKind(value: StoryKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: DictparameterName): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParent(value: StoryId): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
    }
  }
  
  trait StoryInput extends StObject {
    
    var args: Args
    
    var children: js.Array[String]
    
    var id: StoryId
    
    var isLeaf: Boolean
    
    var kind: StoryKind
    
    var name: String
    
    var parameters: DictparameterName
    
    var refId: js.UndefOr[String] = js.undefined
  }
  object StoryInput {
    
    inline def apply(
      args: Args,
      children: js.Array[String],
      id: StoryId,
      isLeaf: Boolean,
      kind: StoryKind,
      name: String,
      parameters: DictparameterName
    ): StoryInput = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryInput]
    }
    
    extension [Self <: StoryInput](x: Self) {
      
      inline def setArgs(value: Args): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: String*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setId(value: StoryId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setKind(value: StoryKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: DictparameterName): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
    }
  }
}
