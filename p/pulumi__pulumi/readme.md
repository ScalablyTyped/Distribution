```
/**
 * Config is a bag of related configuration state.  Each bag contains any number of configuration variables, indexed by
 * simple keys, and each has a name that uniquely identifies it; two bags with different names do not share values for
 * variables that otherwise share the same key.  For example, a bag whose name is `pulumi:foo`, with keys `a`, `b`,
 * and `c`, is entirely separate from a bag whose name is `pulumi:bar` with the same simple key names.  Each key has a
 * fully qualified names, such as `pulumi:foo:a`, ..., and `pulumi:bar:a`, respectively.
 */
/**
 * getProject returns the current project name.  It throws an exception if none is registered.
 */
/**
 * Asset represents a single blob of text or data that is managed as a first class entity.
 */
/**
 * allConfig returns a copy of the full config map.
 */
```