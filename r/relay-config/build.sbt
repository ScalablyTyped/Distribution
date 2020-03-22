organization := "org.scalablytyped"
name := "relay-config"
version := "6.0-dt-20200127Z-6a3963"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "graphql" % "14.6.0-603e55",
  "org.scalablytyped" %%% "relay-compiler" % "8.0-dt-20200127Z-28eb25",
  "org.scalablytyped" %%% "relay-runtime" % "8.0-dt-20200207Z-eb03fd",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
