```
// Type definitions for screeps-profiler 1.2
// Project: https://github.com/gdborton/screeps-profiler
// Definitions by: Casey Link <https://github.com/ramblurr>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
/**
 * The Screeps Profiler is a library that helps to understand where your CPU is being spent in
 * the game of Screeps.
 * It works by monkey patching functions on the Global game object prototypes, with a function that
 * record how long each function takes. The primary benefit of using this profiler is that you can
 * get a clear picture of where your CPU is being used over time, and optimize some of the heavier functions.
 * While it works best for players that heavily employ prototypes in their code, it should work
 * to some degree for all players.
 *
 * Any modules that you use that modify the game's prototypes should be imported
 * before you require the profiler.
 *
 * @see More information at https://github.com/gdborton/screeps-profiler
 */
```