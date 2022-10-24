package typings.storybookStore

import typings.std.Omit
import typings.std.Record
import typings.storybookStore.anon.Cache
import typings.storybookStore.anon.CsfFile
import typings.storybookStore.anon.CsfFileCSFFile
import typings.storybookStore.anon.FnCall
import typings.storybookStore.anon.FnCallStoryAnnotationsComponentAnnotationsProjectAnnotations
import typings.storybookStore.anon.GlobalParameters
import typings.storybookStore.anon.ImportFn
import typings.storybookStore.anon.Stories
import typings.storybookStore.anon.StoryId
import typings.storybookStore.distTs3Dot9ArgsStoreMod.ArgsStore
import typings.storybookStore.distTs3Dot9GlobalsStoreMod.GlobalsStore
import typings.storybookStore.distTs3Dot9HooksMod.HooksContext
import typings.storybookStore.distTs3Dot9StoryIndexStoreMod.StoryIndexStore
import typings.storybookStore.distTs3Dot9TypesMod.BoundStory
import typings.storybookStore.distTs3Dot9TypesMod.CSFFile
import typings.storybookStore.distTs3Dot9TypesMod.ExtractOptions
import typings.storybookStore.distTs3Dot9TypesMod.ModuleImportFn
import typings.storybookStore.distTs3Dot9TypesMod.NormalizedProjectAnnotations
import typings.storybookStore.distTs3Dot9TypesMod.Path
import typings.storybookStore.distTs3Dot9TypesMod.PromiseLike
import typings.storybookStore.distTs3Dot9TypesMod.Story
import typings.storybookStore.storybookStoreStrings.viewMode
import typings.synchronousPromise.mod.SynchronousPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9StoryStoreMod {
  
  @JSImport("@storybook/store/dist/ts3.9/StoryStore", "StoryStore")
  @js.native
  open class StoryStore[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] () extends StObject {
    
    var args: ArgsStore = js.native
    
    def cacheAllCSFFiles(): PromiseLike[Unit] = js.native
    
    var cachedCSFFiles: js.UndefOr[Record[Path, CSFFile[TFramework]]] = js.native
    
    def cleanupStory(story: Story[TFramework]): Unit = js.native
    
    def componentStoriesFromCSFFile(param0: CsfFileCSFFile[TFramework]): js.Array[Story[TFramework]] = js.native
    
    def extract(): Record[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContextForEnhancers<TFramework> */ Any
      ] = js.native
    def extract(options: ExtractOptions): Record[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContextForEnhancers<TFramework> */ Any
      ] = js.native
    
    def fromId(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): BoundStory[TFramework] = js.native
    
    def getSetStoriesPayload(): GlobalParameters = js.native
    
    def getStoriesJsonData(): Stories = js.native
    
    def getStoryContext(story: Story[TFramework]): Omit[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContextForLoaders<TFramework> */ Any, 
        viewMode
      ] = js.native
    
    var globals: GlobalsStore = js.native
    
    var hooks: Record[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
        HooksContext[TFramework]
      ] = js.native
    
    var importFn: ModuleImportFn = js.native
    
    var initializationPromise: SynchronousPromise[Unit] = js.native
    
    def initialize(param0: Cache): PromiseLike[Unit] = js.native
    
    def loadAllCSFFiles(): PromiseLike[js.UndefOr[Record[Path, CSFFile[TFramework]]]] = js.native
    
    def loadCSFFileByStoryId(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): PromiseLike[CSFFile[TFramework]] = js.native
    
    def loadStory(param0: StoryId): js.Promise[Story[TFramework]] = js.native
    
    def onStoriesChanged(param0: ImportFn): js.Promise[Unit] = js.native
    
    var prepareStoryWithCache: FnCallStoryAnnotationsComponentAnnotationsProjectAnnotations = js.native
    
    var processCSFFileWithCache: FnCall = js.native
    
    var projectAnnotations: NormalizedProjectAnnotations[TFramework] = js.native
    
    def raw(): js.Array[BoundStory[TFramework]] = js.native
    
    def resolveInitializationPromise(): Unit = js.native
    
    def setProjectAnnotations(
      projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
    ): Unit = js.native
    
    def storyFromCSFFile(param0: CsfFile[TFramework]): Story[TFramework] = js.native
    
    var storyIndex: StoryIndexStore = js.native
  }
}
